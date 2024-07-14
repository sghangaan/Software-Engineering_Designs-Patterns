

public class TelcoPromo {

    public static void main(String[] args) {
    	
    	header();
        TelcoSubscription smart = new Telco(15, 500, "Smart", false);
        TelcoSubscription globe = new Telco(10, 450, "Globe", true);
        TelcoSubscription ditto = new Telco(8, 400, "Ditto", true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " +"[" + promo.showAllowance(smart) + "]");
        System.out.println("Globe Data Usage Offer and price: " + "[" + promo.showAllowance(globe)+ "]");
        System.out.println("Ditto Data Usage Offer and price: " + "[" + promo.showAllowance(ditto)+ "]");

        System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer(smart));
        System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(globe));
        System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(ditto));
   
    }
    
    public static void header() {
    	 System.out.println("\n\t(================================ WELCOME TO ==================================)");
    	 System.out.println("\t(============================ Visitor Design Pattern ==========================)");
    	 System.out.println("\tlooking for a new mobile plan for your smartphone. Three major telecommunication \n\tproviders are offering enticing deals: Smart, Globe, and Ditto.");
    	 System.out.println("\t--------------------------------------------------------------------------------\n");
    	 } 
}