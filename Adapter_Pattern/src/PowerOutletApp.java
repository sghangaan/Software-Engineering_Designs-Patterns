import java.util.Scanner;

public class PowerOutletApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();


        LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);
        RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        remotedisplay();
        boolean hasExit = false;
        while (!hasExit) {

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    refvolatage();
                    System.out.println(refrigeratorAdapter.plugin() + "\n");
                    break;
                case 2:
                    Lapvolatage();
                    System.out.println(laptopAdapter.plugin() + "\n");
                    break;
                case 3:
                    Smartphonevolatage();
                    System.out.println(smartphoneAdapter.plugin() + "\n");
                    break;
                case 4:
                    hasExit = true;
                    break;
                default:
                    System.out.println("Invalid choice... Try again!");
                    break;
            }
        }

        System.out.println("Exiting...");

        scanner.close();
    }

    public static void remotedisplay() {
        System.out.print("\n\t\t\t     Adapter Pattern \n" +
                "__________________________________________________________________________\n" +
                "---------------------------[  POWER OUTLET ]------------------------------\n" +
                "Press Button\n");
        System.out.print("_________________________________________________________________________\n" +
                "|[1]|  Refrigerator  | [2]|  Laptop   | [3]|   SmartPhone |  [4]|  EXIT  |\n" +
                "|   |    Adapter     |    |  Adapter  |    |     Adapter  |     |        |\n" +
                "|___|________________|____|___________|____|______________|_____|________|\n");
    }
    public static void refvolatage(){
        System.out.println("_______________________________");
        System.out.println("[ Power Outlet Voltage: 220V ]");
        System.out.println("[ Refrigerator Voltage: 210V ]");
        System.out.println("_______________________________");
    }

    public static void Lapvolatage(){
        System.out.println("_______________________________");
        System.out.println("[ Power Outlet Voltage: 220V ]");
        System.out.println("[     Laptop Voltage: 240V   ]");
        System.out.println("_______________________________");
    }

    public static void Smartphonevolatage() {
        System.out.println("____________________________________");
        System.out.println("[   Power Outlet Voltage: 220V    ]");
        System.out.println("[ SmartPhoneCharger Voltage: 125V ]");
        System.out.println("____________________________________");
    }
}