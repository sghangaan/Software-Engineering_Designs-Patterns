
public class GSave implements BankAccountDecorator{
    private BankAccount bankAccount;

   
    public GSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    
    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    
    @Override
    public String showAccountType() {
        return "GSave";
    }

    
    @Override
    public Double getInterestRate() {
        return 0.025;
    }

    
    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    
    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash Transfer";
    }

   
    @Override
    public Double computeBalanceWithInterest() {
        return bankAccount.getBalance() * (1 + getInterestRate());
    }

   
    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}