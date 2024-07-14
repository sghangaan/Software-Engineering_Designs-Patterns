
public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts){
        this.numberOfCarts = numberOfCarts;

    }

    @Override
    public void executeService() {
        cartService(numberOfCarts);
    }

    public void cartService(int numberOfCarts){
        System.out.println("Delivering "+ numberOfCarts +" carts\n");
        System.out.println("Service [ DONE ]");
        System.out.println(" \nReturning to Main Menu...\n");
    }
}