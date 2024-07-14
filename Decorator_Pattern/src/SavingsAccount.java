
public class SavingsAccount implements BankAccount{
    private int accountNumber;
    private String accountName;
    private Double balance;

    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    
    @Override
    public Double getInterestRate() {
        return 0.01;
    }

    
    @Override
    public Double getBalance() {
        return balance;
    }

    
    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

   
    @Override
    public Double computeBalanceWithInterest() {
        return balance * (1 + getInterestRate());
    }

    
    @Override
    public String showInfo() {
        return "Account number: " + accountNumber + "\n" +
                "Account name: " + accountName + "\n" +
                "Balance: " + balance;
    }
}