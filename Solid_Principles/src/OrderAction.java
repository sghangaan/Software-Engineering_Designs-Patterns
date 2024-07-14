
public class OrderAction implements OrderCalculable, OrderPlaceable {

    private Order order;

    public OrderAction(Order order) {
      this.order = order;
    }

    
    public void calculateTotal() {
        double total = order.getPrice() * order.getQuantity();
        System.out.println("Order total: $" + total);
      }    

    
    public void placeOrder() {
        System.out.println("Order placed for " + order.getCustomerName() + " at " + order.getAddress());
      }    
}