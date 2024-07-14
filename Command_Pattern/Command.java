
public interface Command {
    boolean canExecute();
    String execute();
}