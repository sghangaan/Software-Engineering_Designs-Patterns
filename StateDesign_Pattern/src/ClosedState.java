public class ClosedState implements AccountState {
 
    @Override
    public void activate(Account account) {
        System.out.println("\tYou cannot activate a closed account!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("\tYou cannot suspend a closed account!");
    }

    @Override
    public void close(Account account) {
        System.out.println("\tAccount is already closed!");
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("\tYou cannot withdraw on a closed account!");
        System.out.println(account);
    }

    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("\tYou cannot withdraw on a closed account!");
        System.out.println(account);
    }
}
