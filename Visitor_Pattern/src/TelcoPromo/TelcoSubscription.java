
// TelcoSubscription.java
public interface TelcoSubscription {
    public String accept(UsagePromo usage, double price);

    public String accept(UnliCallOffer offer, boolean unliCallText);
    public String getTelcoName();
    public double getPromoPrice();
    public int getDataAllowance();
    public boolean isUnliCallText();
}