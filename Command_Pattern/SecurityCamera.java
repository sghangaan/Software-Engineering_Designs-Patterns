public class SecurityCamera {
    private boolean isOn;

    public SecurityCamera() {
        this.isOn = false;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public String getStatus() {
        return "Security Camera is currently " + (this.isOn ? "on" : "off");
    }

    public String switchOn() {
        this.isOn = true;
        return "Security Camera has been switched-on for monitoring";
    }

    public String switchOff() {
        this.isOn = false;
        return "SecurityCamera has been switched-off for monitoring";
    }




}

