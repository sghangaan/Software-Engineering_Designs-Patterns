
public class InvoiceGenerator implements Generator {
    
    public void generate(Order order, String target) {
        System.out.println("===================== [ Invoice Content ] =======================\n");
        System.out.println(order);
        System.out.println("Invoice generated: [" + target + "]");
      }    
}