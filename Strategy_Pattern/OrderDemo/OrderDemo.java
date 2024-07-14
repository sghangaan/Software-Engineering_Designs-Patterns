public class OrderDemo{
    public static void main(String [] args){

        Order order = new Order(1200.00, new Maya());
        System.out.println(order.calculatePayment());
    }
}