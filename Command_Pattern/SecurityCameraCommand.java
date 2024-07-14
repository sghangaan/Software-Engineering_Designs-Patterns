public class SecurityCameraCommand implements Command {
    private SecurityCamera securitycamera;

    public SecurityCameraCommand(SecurityCamera securitycamera) {
        this.securitycamera = securitycamera;
    }

    public boolean canExecute() {
        return true;
    }

    public String execute() {
        if (!canExecute())
            return null;

        if (this.securitycamera.getIsOn() == false) {
            return securitycamera.switchOn();
        } else {
            return securitycamera.switchOff();
        }
    }
}


