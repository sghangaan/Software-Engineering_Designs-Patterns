
public class DecreaseTempCommand implements Command {
    private Thermostat thermostat;

    public DecreaseTempCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public boolean canExecute() {
        return true;
    }

    public String execute() {
        if (!canExecute())
            return null;

        return this.thermostat.decreaseTemperature();
    }
}
