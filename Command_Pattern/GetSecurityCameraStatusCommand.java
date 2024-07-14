
public class GetSecurityCameraStatusCommand implements Command {
    private SecurityCamera securitycamera;

    public GetSecurityCameraStatusCommand(SecurityCamera securitycamera) {
        this.securitycamera = securitycamera;
    }

    public boolean canExecute() {
        return true;
    }

    public String execute() {
        if (!canExecute())
            return null;

        return this.securitycamera.getStatus();
    }
}
