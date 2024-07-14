
import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet = null;


            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;
                case 3:
                    System.out.println("Exiting program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Number, Please try again!\n");

            }

            if (choice == 1 || choice == 2) {
                idnamekind(petFile);
                if (choice == 1) {
                    System.out.println("Breed: " + ((Dog) pet).getBreed());
                } else {
                    System.out.println("Number of Lives: " + ((Cat) pet).getNoOfLives());
                }
                CSoundPMode(petFile);
            } else {
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }


        }

    }

    public static void idnamekind (PetRecord petFile) {
        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
    }

    public static void CSoundPMode (PetRecord petFile) {
        System.out.println("Communication sound: " + petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play() + "\n");
    }
}