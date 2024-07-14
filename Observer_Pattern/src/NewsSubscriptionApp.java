
import java.util.*;


public class NewsSubscriptionApp {
 
    public static void main(String[] args) {

        while(true){
        	
            header();
            NewsAgency newsAgency = new NewsAgency();
            Scanner userInput = new Scanner(System.in);
         
            List<String> newsCategoriesList = Arrays.asList("Natural Disasters", "Technology", "Politics");
            System.out.print("News Category: ");
	            printList(newsCategoriesList);
	            System.out.println("\n");

            System.out.println("User Preferences:");
            List<Subscriber> subscribersList = new ArrayList<>();

		            for (int i = 1; i <= 3; i++) {
		                String userName = "User" + i;
		                Subscriber subscriber = new SubscriberNews(userName);
		                subscribersList.add(subscriber);
		            		}
		           
		            List<String> preferencesList = new ArrayList<>(List.of("Natural Disasters"));
		            for (Subscriber subscriber : subscribersList) {
		                subscriber.modifyPreferences(preferencesList);
		            		}
		
		            System.out.println();
		            for (Subscriber subscriber : subscribersList) {
		                subscriber.subscribeToNewsAgency(newsAgency);
		            		}
		            		
            
            newsAgency.publishNews("(Natural Disasters)  7.5 quake devastates region");
            System.out.println();
            
            System.out.println("  \t\t--------|| Modify User Preferences: ||-------\n");
            for (Subscriber subscriber : subscribersList) {
                while (true) {
                    System.out.print(subscriber.getName() + ": Modify User1's preferences? [YES/NO]: ");
                    String modifyPreferencesInput = userInput.nextLine().toLowerCase();

                    switch (modifyPreferencesInput) {
                        case "yes":
                            System.out.print("Enter new preferences for " + subscriber.getName() + " (comma-separated): ");
                            preferencesList = Arrays.asList(userInput.nextLine().split(","));
                            subscriber.modifyPreferences(preferencesList);
                            break;

                        case "no":
                            System.out.println(subscriber.getName() + "'s preferences remain unchanged.");  
                            break;

                        default:
                            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                    }

                    System.out.println();
                    if (modifyPreferencesInput.equals("yes") || modifyPreferencesInput.equals("no")) {
                        break; 
                    }
                }
            }

            System.out.println("  \t\t--------||     Unsubcribe User:    ||-------\n");
            
	            for (Subscriber subscriber : subscribersList) {
	                System.out.print("Unsubscribe " + subscriber.getName() + "? [YES/NO]: ");
	                String unsubscribeInput = userInput.nextLine().toLowerCase();
	                if (unsubscribeInput.equals("yes")) {
	                    subscriber.unsubscribeFromNewsAgency();
	                }
	            }
            System.out.println();

            
            newsAgency.publishNews("(Technology) Cyber breach exposes millions!");
            System.out.println();

            
            String subscribeInput;
            while (true) {
                System.out.print("Do you want to subscribe User4? [YES/NO]: ");
                subscribeInput = userInput.nextLine().toLowerCase();

                if (subscribeInput.equals("yes")) {
                	
                    System.out.print("Enter preferences for User4 (comma-separated): ");
                    preferencesList = Arrays.asList(userInput.nextLine().split(","));
                    
                    Subscriber subscriber4 = new SubscriberNews("User4");
                    
                    subscriber4.modifyPreferences(preferencesList);
                    subscriber4.subscribeToNewsAgency(newsAgency);
                    subscribersList.add(subscriber4);
                    break; 
                } else if (subscribeInput.equals("no")) {
                    System.out.println("User4 is not subscribed.");
                    
                    break; 
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }
            System.out.println();
          
            newsAgency.publishNews("(Politics) Rising tensions spark global concern.");
            System.out.println();

            
            String exitChoice = "";
            boolean validExitChoice = false;

            while (!validExitChoice) {
                System.out.print("\nDo you still wish to use the program? [YES/NO]: ");
                exitChoice = userInput.nextLine().toLowerCase();

                if (exitChoice.equals("yes") || exitChoice.equals("no")) {
                    validExitChoice = true;
                    System.out.println();
                } else {
                    System.out.println("Invalid input choice. Please enter \"yes\" or \"no\".");
                }
            }

            if (exitChoice.equals("no")) {
            	 displayprogrammer();
                userInput.close();
                System.exit(0);
            }
        }
        
    }
    
    private static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }
    
    public static void displayprogrammer() {
	  	System.out.println("\n \t\t-------------> App Shuting Down <------------\n");	
        System.exit(0);
    }
    public static void header() {
		   
		   System.out.println("\n\t(======================= WELCOME TO ==========================)");
		   System.out.println("\t(========== Real-time News Subscription Service ==============)");
		   System.out.println("\t---------------------------------------------------------------\n");
	    }  
}