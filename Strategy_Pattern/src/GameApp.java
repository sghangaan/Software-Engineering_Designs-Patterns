

public class GameApp {
    public static void main(String [] args){
        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());

        System.out.println("\n\t(============================== WELCOME TO =============================)");
        System.out.println("\t(============== GameApp involving three types of characters: ===========)");
        System.out.println("\t========================= Knight, Wizard, and Archer ===================)");
        System.out.println("\t-------------------------------------------------------------------------\n");
        
        System.out.println("\n\tCharacters Attack Actions: \n");
        System.out.println(knight.characterAtk());
        System.out.println(wizard.characterAtk());
        System.out.println(archer.characterAtk());
        System.out.println();

        System.out.println("\tCharacters Defense Actions: \n");
        System.out.println(knight.characterDef());
        System.out.println(wizard.characterDef());
        System.out.println(archer.characterDef());
        System.out.println();
        displayprogrammer();
    }

    public static void displayprogrammer() {
        System.out.println("\n \t\t------------------> App Shuting Down <----------------\n");
    }
}
