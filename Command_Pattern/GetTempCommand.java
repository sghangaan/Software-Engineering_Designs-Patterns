public class GetTempCommand implements Command {
    private Thermostat thermostat;

    public GetTempCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public boolean canExecute() {
        return true;
    }

    public String execute() {
        if (!canExecute())
            return null;

        return this.thermostat.getTemperature();
    }
}
