
# Software Engineering

This repository showcases the implementation of various design patterns and principles in Java, along with problem scenarios and UML diagrams for each pattern.

<p align="center">
    <img src="overview.png" alt="Centered Image" /><br>
</p>


# Design Patterns and Principles

The following design patterns and principles are implemented in this repository:

- Adapter Pattern
- Builder Pattern
- Command Pattern
- Decorator Pattern
- Facade Pattern
- Factory Pattern
- Observer Pattern
- Singleton Pattern
- SOLID Principles with Design Pattern
- SOLID Principles
- State Design Pattern
- Strategy Pattern
- Visitor Pattern


# Problem Scenarios
Each design pattern and principle is implemented in its respective directory. The implementation includes:

- Java source code demonstrating the pattern or principle.
- A problem scenario description.
- UML diagrams illustrating the structure and flow of the pattern or principle.


# Adapter Pattern
#### Scenario: You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

### Builder Pattern
#### Scenario: Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.
____________________________________________________________________

Initially, you use a standard constructor for the User class:

```
public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}
```

However, you encounter challenges:
<ul>
<li>Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.</li>
<li>Optional fields: Not all customers provide complete information, but the constructor forces them to.</li>
<li>Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.</li>
</ul>



# Command Pattern
#### Scenario: Imagine you're building a smart home automation system where various devices (lights, thermostat, music player, etc.) can be controlled remotely using a central hub or app. Each device has different functionalities, but you want to create a unified and flexible control mechanism.

Design a system that allows you to control multiple smart home devices with ease. Your goal is to create a solution where:

You can control a variety of devices from a central hub or app, sending commands like "Turn On," "Turn Off," "Increase Temperature," "Decrease Volume," etc. Each device has unique actions associated with these commands. For example, turning on the lights might involve changing their brightness level, while turning on the music player may involve playing a specific playlist. New devices can be seamlessly integrated into the system without modifying existing code. You want to ensure that adding a new device doesn't require changes to the central control logic. Devices can be controlled without the central hub or app needing to understand the internal workings of each device. It should send high-level commands without needing low-level details. Your challenge is to apply a design pattern that provides a flexible and scalable way to control a variety of smart home devices, ensuring that new devices can be added without disrupting the existing system's functionality.


# Decorator Pattern
#### Scenario:
Cimb is a digital bank that offers GSave and UpSave savings accounts. As with a typical Savings Account, it contains accountNumber, accountName, and a balance for that account.

<li> The typical savings account offers an interest rate of 1%. The benefits of the typical savings account is the same with the "Standard Savings Account" as compared to other banks.

<li> The GSave account offers an interest rate of 2.5%. Benefits include the "Standard Savings Account" plus access to "GCash transfer".

<li> The UpSave account offers the highest interest rate of 4.0%. Benefits include the "Standard Savings Account" plus "with Insurance".

### The content of your Cimb.java should ONLY contain the following codes with the exception of inserting your own package name : 

<br> 
<p align="center">
  <img src="https://github.com/SG-Hangaan/decoratorPattern/assets/127215110/e7d9ddb8-fd4e-42d7-8a2b-d0e38ce376ff"/>
</p>


<p align="center">
  You should display the following output: <br> <br> 
  <img src="https://github.com/SG-Hangaan/decoratorPattern/assets/127215110/3b5fb13e-6d26-4ccb-a606-631776b6a441"/>
</p>

**Description of the following methods**

1. **showAccountType()** - Either returns "Savings Account", "GSave" or "UpSave"
2. **getInterestRate()** - Either returns 1% for Savings Account; 2.5% for GSave; 4.0% UpSave
3. **getBalance()** - Returns the balance of the account set.
4. **showBenefits()** - Either returns "Standard Savings Account" for Savings Account;
benefits offered by savings account + "GSave Transfer";
benefits offered by savings account + "With Insurance";
5. **computeBalanceWithInterest()** - returns new balance by computing the balance plus the interest depending on the interest rate.
6. **showInfo()** - Returns details of account number, account name, and balance.

### BankAcountDecorator must be an interface. Follow instructions. You are not allowed to insert other methods except what is stated in the diagram (setters and getters are allowed).


# Facade Pattern
#### Scenario: The HotelApp needs to manage various hotel services for guest check-in and check-out. These services include valet parking for vehicles, room cleaning, and handling luggage carts. However, the HotelApp aims to interact with these services through a simplified, single interface provided by the FrontDesk. The FrontDesk class should delegate the client's requests to the appropriate service classes (Valet, HouseKeeping, Cart) while abstracting the service details from the client.

#### Class Definitions
- HotelService (Interface): Defines the common interface for all hotel services. <br>
- Valet: A service class implementing the HotelService interface, responsible for vehicle valet parking and pick-up. It includes the pickUpVehicle(plateNumber) method. <br>
- HouseKeeping: A service class implementing the HotelService interface, responsible for room cleaning. It includes the cleanRoom(roomNumber) method. <br>
- Cart: A service class implementing the HotelService interface, responsible for handling luggage cart requests. It includes the requestCart(numberOfCarts) method. <br>
- FrontDesk: The facade class that coordinates interactions between the client (HotelApp) and the individual hotel services. <br>
- HotelApp: The client class that uses the FrontDesk facade to access and utilize hotel services seamlessly. <br>


# Factory Pattern
#### Scenario: Implement factory design pattern using Pet as the factory interface.  The interface implements two methods: makeSound() and play().

- Dog and Cat are concrete objects that implements Pet interface.
- PetRecord holds attributes such as petId, petName, and Pet.
- Clinic would be the client object.
- Refer to the UML Class Diagram



# Observer Pattern
#### Scenario: You're tasked with designing a real-time news subscription service for a media company. The system needs to notify subscribers about breaking news as soon as it's published by the news agency. <br>

**Scenario Description:** The system comprises two main components: NewsAgency and Subscriber.

- **NewsAgency:** Represents the central hub for publishing news. It maintains a list of subscribers and notifies them whenever new news is available. <br>
- **Subscriber:** Represents users or entities subscribed to the news service. Subscribers receive immediate notifications about any breaking news published by the agency.<br> </ul>



# Singleton Pattern
#### Scenario: The Pag-ibig office implements a centralized queuing system for three help desk stations. Individuals visiting the office obtain a queue number from this centralized system. Additionally, there's an online monitoring system that displays the current queued number in real-time for individuals monitoring the queue remotely.

Each help desk station has an option to reset the queuing number based on an inputted number, allowing flexibility in managing the queue during specific situations, such as reorganization or technical issues. This queuing system ensures a single centralized queue number for all help desk stations, while the reset option offers control and adjustment in exceptional circumstances.

This approach aims to maintain an organized queuing process for individuals visiting the office and provides the flexibility to handle queue adjustments as needed.



# SOLID Principles with Design Pattern
#### Scenario: The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers. Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

# SOLID Principles
#### Scenario: Improve the following codes to implement SOLID principles in OOP.

```
public interface Order {

  void calculateTotal(double price, int quantity);
  void placeOrder(String customerName, String address);
  void generateInvoice(String fileName);
  void sendEmailNotification(String email);
}

```

```
public class OrderAction implements Order {

  @Override
  public void calculateTotal(double price, int quantity) {
    double total = price * quantity;
    System.out.println("Order total: $" + total);
  }

  @Override
  public void placeOrder(String customerName, String address) {
    // Simulate placing order in a system
    System.out.println("Order placed for " + customerName + " at " + address);
  }

  @Override
  public void generateInvoice(String fileName) {
    // Simulate generating invoice file
    System.out.println("Invoice generated: " + fileName);
  }

  @Override
  public void sendEmailNotification(String email) {
    // Simulate sending email notification
    System.out.println("Email notification sent to: " + email);
  }
}

```

```
public class OrderTest {

  public static void main(String[] args) {
    Order order = new OrderAction();
    order.calculateTotal(10.0, 2);
    order.placeOrder("John Doe", "123 Main St");

    // These methods might not be needed for all orders
    order.generateInvoice("order_123.pdf");
    order.sendEmailNotification("johndoe@example.com");
  }
}

```


# State Design Pattern
#### Scenario:
A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.

<li> Active accounts: Allow deposits and withdrawals. <br>
<li> Suspended accounts: Disallow deposits and withdrawals transactions, but allow viewing account information.  <br>
<li> Closed accounts: Disallow all transactions and viewing of account information. <br>

Currently, the system relies on conditional statements within the Account class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

Implement the State pattern to improve code maintainability and flexibility:
```
1. Define Account States: Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState.
2. Implement State Interface: Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close.
3. Implement State Behaviors: Each concrete state class implements the AccountState interface, providing specific behavior for its respective state.
                              For example, the ActiveState class would allow deposits and withdrawals,
                              while the ClosedState wouldn't allow any transactions.
4. Update Account Class:
         - Include attributes for accountNumber and balance.
         - Remove state-specific logic from the Account class.
         - Introduce a reference to the current AccountState object.
         - Delegate actions like deposit, withdraw, activate, suspend, and close to the
           current state object through its corresponding methods.

```
### Logic:

```
If the account is active
    You can either suspend it or close it.
If the account is suspended
    You can either activate or close it.
     No deposits and withdrawals allowed.
If the account is closed
     You can neither suspend nor activate it.
      No deposits and withdrawals allowed.
```
```
Composition of Account:
attributes:
accountNumber : String
balance:  Double
accountState:  AccountState

Methods:
Setter and getter methods
deposit(Double depositAmount): void
withdraw(Double withdrawAmount): void
suspend(): void
activate(): void
close() : void
toString() // displays account number and balance

Note:  No if-else, switch will be used
--------------------------------------------------
```

```
Create AccountTest() class to test the Account:
public class AccountTest(){
	public static void main (String[] args){

		Account myAccount = new Account("1234", 10000.0); // set acct to active state
		myAccount.activate(); // displays "Account is already activated!"

		// Suspend the account
		myAccount.suspend(); //displays "Account is suspended!"

		// Activate the account
		myAccount.activate() //displays "Account is activated!"
		
		// Deposit to the account
		myAccount.deposit(1000.0);// update balance and displays account number and
		// current balance. Call the toString() method in deposit().    	                                

		// Withdraw to the account
		myAccount.withdraw(100.0);// update balance and displays account number and
		// current balance. Call the toString() method in withdraw().    	                                

		//Close the account()
		myAccount.close() //displays "Account is closed!"

		//Activate the account
		myAccount.activate() // Displays "You cannot activate a closed account!"	

		//Suspend the account
		my.Account.activate() // Displays " You cannot suspend a closed account!"


		//Withdraw to the account
		myAccount.withdraw(500.0);// Show message "You cannot withdraw on a closed
                              // account!". Call the toString() to show current
                              // balance and account number.

		//Deposit to the account
		myAccount.deposit(1000.0);// Show message "You cannot deposit on closed account!".
                              // Call the toString() to show current balance and account number.
            }
    }

```


# Strategy Pattern
#### Scenario: The problem scenario involves three character types, each with specific attack and defense strategies. The characters are:

1. Knight: Attacks with a sword and has three defense strategies (shield, dodge, magic barrier).
2. Wizard: Casts spells and uses magic barrier for defense.
3. Archer: Shoots arrows and uses dodge for defense.

Implement two types of Strategy: <br>
```
	A.  DefenseStrategy 
	     1. Shield 
	     2. Dodge 
	     3. CreateMagic  

	B.  AttackStrategy 
	     1.  CastSpell 
	     2.  ShootArrow 
	     3.  SwingSword   
```

### Refactor the existing codes and provide the UML Diagram:
```
public class Character {
    private String type;

    public Character(String type) {
        this.type = type;
    }

    public void attack() {
        if (type.equals("Knight")) {
            System.out.println("Knight attacks with a sword!");
        } else if (type.equals("Wizard")) {
            System.out.println("Wizard casts a spell!");
        } else if (type.equals("Archer")) {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("Knight")) {
            System.out.println("Using a shield to defend!");
	System.out.println("Dodgin to avoid attack!");
            System.out.println("Creating a magic barrier for defense!"");		

        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!"");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!"");
        }
    }
}
```


# Visitor Pattern
#### Scenario: You are a software developer working on an e-commerce platform that sells various types of furniture (chairs, tables, sofas, etc.). You want to implement a functionality that calculates the shipping cost based on the furniture type and size.

Each furniture type might have its own unique shipping cost calculation logic. For example, chairs might be lightweight and have a flat shipping rate, while sofas might be bulky and require a distance-based shipping cost calculation. Implementing separate shipping logic within each furniture class would lead to tight coupling and difficulty adding new furniture types in the future.

Implement a visitor design pattern approach: 

<ul>
<li>You must show the different elements of visitor design in your solution.  
<li>DO NOT USE ABSTRACT CLASSES. 
<li>You are free to name your interfaces and concrete classes. 
<li>Have a client code that will test your program.
<li>Design your own UML Class Diagram.  </li>
</ul>

#### Scenario: Imagine you are looking for a new mobile plan for your smartphone. Three major telecommunication providers are offering enticing deals: Smart, Globe, and Ditto.

<ul>
<li>Smart: Offers a data allowance of 15 GB for ₱500 per month. However, they do not offer any free calls or texts, and you will be charged per use.</li>
<li>Globe: Provides a data allowance of 10 GB for ₱450 per month. This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.</li>
<li>Ditto: Offers a data allowance of 8 GB for ₱400 per month. This plan includes unlimited calls and texts to all  networks within the country. </li>
</ul>

## Test your codes before the given client program:

```
public class TelcoPromo {
  public static void main(String[] args) {
    TelcoSubscription smart = new Telco(15, 500, Smart,false);
    TelcoSubscription globe = new Telco(10, 450, Globe,true);
    TelcoSubscription ditto = new Telco(8, 400, Ditto,true);

    UsagePromo promo = new TelcoAllowance();
    UnliCallOffer unli = new UnliCallTextPackage();    

    System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart) );
    System.out.println("Globe Data Usage Offer and price" + promo.showAllowance(globe));
    System.out.println("Ditto Data Usage Offer and price" + promo.showAllowance(ditto));

    System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer(smart));
    System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(globe));
    System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(ditto));
  }
}

```

## How to Run

1. Clone this repository:
    ```bash
    git clone https://github.com/SG-Hangaan/Software-Engineering_Designs-Patterns.git
    ```
2. Navigate to the respective pattern or principle directory:
    ```bash
    cd software-engineering/AdapterPattern
    ```
3. Compile and run the Java files:
    ```bash
    javac *.java
    java Main
    ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or new pattern implementations.

## Contact

For any questions or feedback, please contact Sharon Grace at sghangaan@proton.me
