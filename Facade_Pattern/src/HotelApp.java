
import java.util.Scanner;
import java.util.InputMismatchException;

public class HotelApp {
	
	static Scanner sc = new Scanner(System.in);   
	static Scanner scan = new Scanner(System.in);  
	static Scanner valet = new Scanner(System.in);
	
    public static void main(String[] args) {
       
    	Scanner services = new Scanner(System.in);
        header(); 
        
        
        while (true) {
        		try {
        			ServicesofferedMenu();
	                System.out.print("Enter desired Hotel Service: ");
	                int request = services.nextInt();
	
		                if (isValidService(request)) {
		                    service(request);
		                } else if (request == 4) {
		                    displayprogrammer();
		                    System.exit(0);
		                } else {
		                    System.out.println("Error. Please input number only from [1-4].\n");
	                }
        		} catch (InputMismatchException e) {
	                System.out.println("Error: Invalid input. Please enter a valid number.\n");
	                services.next(); // Clear the invalid input from the scanner
        	}
       	}
    }

    private static boolean isValidService(int request) {
        return request >= 1 && request <= 3;
    }
    
    public static void service(int request) throws IllegalArgumentException {
        switch (request) {
            case 1:
                ValetServices();
                break;
            case 2:
                HouseKeepingservice();
                break;
            case 3:
                Cartservices();
                break;
            default:
                throw new IllegalArgumentException("Invalid service request. Please input a number from [1-3].");
        }
    }
    

    public static void ValetServices() {
    	
    	System.out.println("\n\t(============= Valet parking Services ============)\n");
        System.out.println("\t   [1]  Parking Service -|- [2] Pick-up Service\n");
          
        System.out.print("Enter Desired Parking Service: ");
        int serve = sc.nextInt();
        
        System.out.print("Enter your Vehicle Plate Number: ");
        String plateNumber = valet.nextLine();
        
        if (serve == 1 || serve == 2) {
            String service;
            
            if (serve == 1) {
                service = "Parking";
            } else {
                service = "Pick-up";
            }
            
            HotelService valetService = new Valet(plateNumber, service);
            FrontDesk.hotelService(valetService);
        } else {
            System.out.println("Error: Invalid service request. Please select a valid option (1 or 2).");
        }
        
    	
    }
    
    
    public static void HouseKeepingservice() {
    	
    	 System.out.println("\n\t(============= HouseKeeping Services ============)\n");
         System.out.print("Enter your Room Number: ");
         String roomNumber = scan.nextLine();
         HotelService houseKeepingService = new HouseKeeping(roomNumber);
         FrontDesk.hotelService(houseKeepingService);

    	
    }
    
    public static void Cartservices() {
    	
    	 try {
    		 System.out.println("\n\t(============= Request Cart Services ============)\n");
             System.out.print("Enter your desired number of carts: ");
             int numberOfCarts = sc.nextInt();
             HotelService cartService = new Cart(numberOfCarts);
             FrontDesk.hotelService(cartService);
         }
         catch (Exception e){
             System.out.println("Exceeding/Invalid Number of Carts\n");
         }

    }
    
   
	public static void ServicesofferedMenu() {
		
			System.out.println("\nServices Offered:\n");
	        System.out.println("1.) Valet (Car parking & pick-up)");
	        System.out.println("2.) Housekeeping (Room Cleaning)");
	        System.out.println("3.) Cart (Handling luggage and cart services)");
	        System.out.println("4.) Exit\n");
		}
    
	  public static void displayprogrammer() {
	   
		  	System.out.println("\n\t---------------> App Shuting Down <-----------------\n");
	        System.exit(0);
	    }
	    
	    
	   public static void header() {
		   
		   System.out.println("\n\t(================== WELCOME TO ==================)");
		   System.out.println("\t(============== HOTEL SERVICES APP ==============)");
		   System.out.println("\t--------------------------------------------------");
	    }  
}