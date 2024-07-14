import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.util.Map;

public class SmartHomeAutomation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SecurityCamera securitycamera = new SecurityCamera();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        CentralHub centralhub = new CentralHub(new SecurityCameraCommand(securitycamera),
                new GetSecurityCameraStatusCommand(securitycamera),
                new IncreaseTempCommand(thermostat),
                new DecreaseTempCommand(thermostat),
                new GetTempCommand(thermostat),
                new VolumeUpCommand(musicPlayer),
                new VolumeDownCommand(musicPlayer),
                new GetVolumeCommand(musicPlayer));

        final boolean[] hasExit = {false};

        remotedisplay();
        while (!hasExit[0]) {
            try {
                System.out.print("Enter choice: ");
                int choice = getUserChoice(scanner);
                System.out.println();

                Map<Integer, Runnable> choiceMap = new HashMap<>();
                choiceMap.put(1, centralhub::SecurityCameraButton);
                choiceMap.put(2, centralhub::IncreaseTempButton);
                choiceMap.put(3, centralhub::DecreaseTempButton);
                choiceMap.put(4, centralhub::VolumeUpButton);
                choiceMap.put(5, centralhub::VolumeDownButton);
                choiceMap.put(6, centralhub::DiagnosticsButton);
                choiceMap.put(7, () -> {
                    hasExit[0] = true;
                    System.out.print("Exiting...");
                });

                choiceMap.getOrDefault(choice, () -> System.out.println("Invalid Choice!")).run();
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    public static void remotedisplay() {
        System.out.print("\n\t\tSmart Home Automation\n" +
                "_______________________________________________________\n" +
                "-----------------[  CENTRAL HUB ]----------------------\n" +
                "Press Button\n");
        System.out.print("_______________________________________________________\n" +
                "|[1]| Security | [2]| [+]Increase  | [3]| [-]decrease  |\n" +
                "|   |  Camera  |    |  Thermostat  |    |  Thermostat  |\n" +
                "|   | [on/off] |    |  Temperature |    |  Temperature |\n" +
                "_______________________________________________________\n" +
                "|[4]|[+]Increase |[5]| [+]decrease | [6]|  Diagnostic  |\n" +
                "|   |   Multi    |   |    Multi    |    |  Button      |\n" +
                "|   |   Player   |   |    Player   |    |  Hub         |\n" +
                "|   |   Volume   |   |    Volume   |    |              |\n" +
                "________________________________________________________\n" +
                "|                [7] | EXIT BUTTON |                   |\n" +
                "___-__________-____-______________-____-_______________-\n");
    }

    private static int getUserChoice(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Clear the invalid input from the scanner
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }
}
