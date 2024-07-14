
public class OrderTest {
    public static void main(String[] args) {

      header();
      Order order = new Order(10.0, 2, "John Doe", "123 Main St");
      OrderAction orderAction = new OrderAction(order);

      Generator invoicGenerator = new InvoiceGenerator();
      NotificationSender emailNotifSender = new EmailNotifSender();
  
      orderAction.calculateTotal();
      orderAction.placeOrder();
  
      // These methods might not be needed for all orders
      System.out.println();
      invoicGenerator.generate(order, "order_123.pdf");
      System.out.println();
      emailNotifSender.sendNotification(order, "johndoe@example.com");
      System.out.println();
    }
    
    public static void header() {
      	 System.out.println("\n\t(================== WELCOME TO ==================)");
      	 System.out.println("\t(=================== OrderTest ==================)");
      	 System.out.println("\t--------------------------------------------------\n");
      	 } 
  }