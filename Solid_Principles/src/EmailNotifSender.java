
public class EmailNotifSender implements NotificationSender {
    
    public void sendNotification(Order order, String target) {
      System.out.println("======================= [ Email Content ] ========================\n");
      System.out.println(order);
      System.out.println("Email notification sent to: [" + target + "]");
    }  
}