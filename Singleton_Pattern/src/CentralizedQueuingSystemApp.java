
import java.util.Scanner;
import java.util.Random;


public class CentralizedQueuingSystemApp {
    
    public static void main(String[] args) {

        while(true){
        	
            Scanner userInput = new Scanner(System.in);
            QueueManagementSystem queuingSystem = QueueManagementSystem.getInstance();
            
            header();
            HelpDeskStation helpDesk1 = new HelpDeskStation("Help Desk Station     1", queuingSystem);
            HelpDeskStation helpDesk2 = new HelpDeskStation("Help Desk Station     2", queuingSystem);
            HelpDeskStation helpDesk3 = new HelpDeskStation("Help Desk Station     3", queuingSystem);

           
            queuingSystem.registerHelpDesk(helpDesk1, 0);
            queuingSystem.registerHelpDesk(helpDesk2, 0);
            queuingSystem.registerHelpDesk(helpDesk3, 0);

            System.out.println("       [ Individual } " + " in "+ "   [ Help Desk Station ]  NO: " + " [ Queue Number ]   NO: ");
           
            int personIndinum = 7;
            for (int x = 1; x <= personIndinum; x++) {
                HelpDeskStation currentHelpDesk = getRandomHelpDesk(helpDesk1, helpDesk2, helpDesk3);
                int currentQueueNumber = currentHelpDesk.generateQueueNumber();
                System.out.println( "    \t      "+ x + "\t\t       "  + currentHelpDesk.getName() + " \t   Queue Number:     " + currentQueueNumber);
            }
            System.out.println();

            displayCurrentQueueNumbers(helpDesk1, helpDesk2, helpDesk3);
          
            resetQueueWithUserInput(helpDesk1, userInput);
            resetQueueWithUserInput(helpDesk2, userInput);
            resetQueueWithUserInput(helpDesk3, userInput);

           
            OnlineMonitoringSystem monitoringSystem = new OnlineMonitoringSystem(queuingSystem);
            monitoringSystem.displayRealTimeQueue();

            Scanner userInputChoice = new Scanner(System.in);
            
            while (true) {
                System.out.print("\nShould the program keep running? [Yes/No]: ");
                String exit = userInputChoice.nextLine().toLowerCase();

                if ("yes".equals(exit) || "no".equals(exit)) {
                    if ("no".equals(exit)) {
                        displayprogrammer();
                        userInputChoice.close();
                        
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Invalid input choice. Please enter either \"Yes\" or \"No\".");
                }
            }
            
        }
    }

    
    private static void displayCurrentQueueNumbers(HelpDeskStation... helpDesks) {
        System.out.println("\n\n\t\t\t\tCurrent Queue Number: ");
        System.out.println("\t\t_________________________________________________________ ");
        for (HelpDeskStation helpDesk : helpDesks) {
            System.out.println("\t\tCurrent Queue Number for " + helpDesk.getName() + ":  [ " + helpDesk.getCurrentQueueNumber() + " ]");
        }
        System.out.println();
    }

    
    private static HelpDeskStation getRandomHelpDesk(HelpDeskStation... helpDesks) {
        Random random = new Random();
        int randomIndex = random.nextInt(helpDesks.length);
        return helpDesks[randomIndex];
    }

   
    private static void resetQueueWithUserInput(HelpDeskStation helpDesk, Scanner userInput) {
        boolean validChoice = false;
        while (!validChoice) {
            System.out.print(helpDesk.getName() + ", \nDo you want to reset the Queue Number? [YES/NO]: ");
            String resetChoice = userInput.nextLine().toLowerCase();

            if (resetChoice.equals("yes")) {
                validChoice = true;
                int newQueueNumber = 0;
                boolean validNumber = false;

                while (!validNumber) {
                    try {
                        System.out.print("Queue Number Reset: ");
                        newQueueNumber = Integer.parseInt(userInput.nextLine());
                        System.out.println();
                        validNumber = true;
                       
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid integer for the queue number.");
                        System.out.println();
                    }
                }

                helpDesk.resetQueue(newQueueNumber);
            } else if (resetChoice.equals("no")) {
                validChoice = true;
                System.out.println("Queue number for " + helpDesk.getName() + " will not be reset.");
                System.out.println("_________________________________________________________ ");
                System.out.println();
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                System.out.println();
            }
        }
        
    }
    
    public static void header() {
		   
		   System.out.println("\n\t(============================ WELCOME TO ===============================)");
		   System.out.println("\t(=========== Centralized Queuing System for Pag-ibig Office ============)");
		   System.out.println("\t-------------------------------------------------------------------------\n");
	    } 
    
    public static void displayprogrammer() {
	  	System.out.println("\n \t\t\t-------------> App Shuting Down <------------\n");
        System.exit(0);
    }
}