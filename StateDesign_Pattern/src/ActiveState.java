public class ActiveState implements AccountState {

    // suspend or close

    @Override
    public void activate(Account account) {
        System.out.println("\tAccount is already activated!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("\tAccount is suspended!");
        account.setAccountState(new SuspendedState());
    }

    @Override
    public void close(Account account) {
        System.out.println("\tAccount is closed!");
        account.setAccountState(new ClosedState());
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("\tWithdrawing " + withdrawAmount);
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println(account);
    }

    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("\tDepositing " + depositAmount);
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println(account);
    }

}