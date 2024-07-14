public class Order{
    private Double orderAmount;
    private PaymentType paymentType;



public Order(Double amount, PaymentType paymentType){
    this.orderAmount = amount;
    this.paymentType = paymentType;
}


 public String calculatePayment(){
      return "Your order amount is " + orderAmount + "\n" + paymentType.calculatePayment(); 
}


}