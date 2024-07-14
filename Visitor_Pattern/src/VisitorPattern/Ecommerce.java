import Calculators.*;
import furnituretypes.*;

public class Ecommerce {
    public static void main(String[] args) {

       
        Furniture ivorylounge = new Chair("Durable Ivory Seat", "medium");
        Furniture majesticCouch = new Sofa("Deluxe Lounge", "large");
        Furniture everydatSofa = new Sofa("Modest Lounge", "medium");
        Furniture personalSleeper = new Bed("Compact Individual Bed", "small");
        Furniture royalqueen = new Bed("Grand Royal Bed", "large");

        
        ShippingCalc shippingCalc = new FurnitureShipCalc();
        double distanceKM;

        header();
        System.out.println("Shipping Calculations:");

        System.out.println("\n" + ivorylounge);
        distanceKM = 20.0;
        System.out.print("Distance: " + distanceKM + " km");
        
        System.out.println("\nTotal Shipping Cost: Php  "
        + ivorylounge.accept(shippingCalc, ivorylounge.getSize(), distanceKM) + "\n");

    
        System.out.println("\n" + majesticCouch);
        distanceKM = 10.0;
        System.out.print("Distance:  " + distanceKM + " km");
        System.out.println("\nTotal Shipping Cost: Php "
                + majesticCouch.accept(shippingCalc, majesticCouch.getSize(), distanceKM)+ "\n");

        
        System.out.println("\n" + everydatSofa);
        distanceKM = 30.0;
        System.out.print("Distance: " + distanceKM + " km ");
        System.out.println("\nTotal Shipping Cost: Php "
                + everydatSofa.accept(shippingCalc, everydatSofa.getSize(), distanceKM) + "\n");

        
        
        System.out.println("\n" + personalSleeper);
        distanceKM = 15.0;
        System.out.print("Distance: " + distanceKM + " km ");
        		
        System.out.println("\nTotal Shipping Cost: Php "
                + personalSleeper.accept(shippingCalc, personalSleeper.getSize(), distanceKM) + "\n");

        System.out.println("\n" + royalqueen);
        distanceKM = 30.0;
        System.out.print("Distance: " + distanceKM + " km ");
        		
        System.out.println("\nTotal Shipping Cost: Php "
                + royalqueen.accept(shippingCalc, royalqueen.getSize(), distanceKM));
    }
    
    public static void header() {
   	 System.out.println("\n\t(===================================== WELCOME TO ======================================)");
   	 System.out.println("\t(============================= Ecommerce Furniture Shop ================================)");
   	 System.out.println("\t( E-Commerce platform that sells various types of furniture (chairs, tables, sofas, etc.)");
   	 System.out.println("\t-----------------------------------------------------------------------------------------\n");
   	 } 
    
}