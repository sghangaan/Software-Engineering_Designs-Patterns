import java.util.*;

public class ECommerceApp {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("\n\t(============================ WELCOME TO ===============================)");
        System.out.println("\t(=============== E-Commerce Application Registration Form  =============)");
        System.out.println("\t-------------------------------------------------------------------------\n");
        System.out.println("Please Enter your use details to Proceed...\n");
    
        String firstName = getInput("Enter your first name: ", "First name is required. Please enter your first name.", userInput);
        String lastName = getInput("Enter your last name: ", "Last name is required. Please enter your last name.", userInput);

        System.out.print("Enter your email (optional): ");
        String email = userInput.nextLine();

        System.out.print("Enter your address (optional): ");
        String address = userInput.nextLine();

        String phone = getInput("Enter your phone number: ", "Phone number is required. Please enter your phone number.", userInput);

        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter your age: ");
            String ageInput = userInput.nextLine().trim();
            if (ageInput.isEmpty())
                System.out.println("Age is required. Please enter your age.\n");
            else {
                try {
                    age = Integer.parseInt(ageInput);
                    if (age <= 0)
                        System.out.println("The provided Age must adhere to a valid format.\n");
                    else
                        validAge = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please rectify this by entering a valid numerical value for age in the registration form.\n");
                }
            }
        }

        User user = new User.UserBuilder()
                .lastName(lastName) .phone(phone) .firstName(firstName) .age(age)
                .address(address) .email(email) .build();

        System.out.println();
        System.out.println("\t(======================= User Information Details ======================)\n");
        System.out.println("First Name: " + user.firstName);
        System.out.println("Last Name: " + user.lastName);
        System.out.println("Email: " + user.email);
        System.out.println("Address: " + user.address);
        System.out.println("Phone Number: " + user.phone);
        System.out.println("Age: " + user.age);
        displayprogrammer();
        System.out.println();
    }

    private static String getInput(String prompt, String errorMessage, Scanner scanner) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.isEmpty())
                System.out.println(errorMessage + "\n");
        } while (input.isEmpty());
        return input;
    }

    public static void displayprogrammer() {
      System.out.println("\n \t\t------------------> App Shuting Down <----------------\n");
     
  }
}