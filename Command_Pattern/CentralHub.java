import java.util.HashMap;
import java.util.Map;

public class CentralHub {

    private Map<String, Command> commands = new HashMap<>();

    public CentralHub(SecurityCameraCommand securitycameraCommand,
                      GetSecurityCameraStatusCommand getSecurityCameraStatusCommand,
                      IncreaseTempCommand increaseTempCommand,
                      DecreaseTempCommand decreaseTempCommand,
                      GetTempCommand getTempCommand,
                      VolumeUpCommand volumeUpCommand,
                      VolumeDownCommand volumeDownCommand,
                      GetVolumeCommand getVolumeCommand) {

        commands.put("securityCamera", securitycameraCommand);
        commands.put("getSecurityCameraStatus", getSecurityCameraStatusCommand);
        commands.put("increaseTemp", increaseTempCommand);
        commands.put("decreaseTemp", decreaseTempCommand);
        commands.put("getTemp", getTempCommand);
        commands.put("volumeUp", volumeUpCommand);
        commands.put("volumeDown", volumeDownCommand);
        commands.put("getVolume", getVolumeCommand);
    }

    public void pressButton(String button) {
        Command command = commands.get(button);
        if (command != null) {
            System.out.println(command.execute());
        } else {
            System.out.println("Invalid button action");
        }
    }

    public void SecurityCameraButton() {
        pressButton("getSecurityCameraStatus");
        pressButton("securityCamera");
        pressButton("getSecurityCameraStatus");
    }

    public void IncreaseTempButton() {
        pressButton("getTemp");
        pressButton("increaseTemp");
        pressButton("getTemp");
    }

    public void DecreaseTempButton() {
        pressButton("getTemp");
        pressButton("decreaseTemp");
        pressButton("getTemp");
    }

    public void VolumeUpButton() {
        pressButton("getVolume");
        pressButton("volumeUp");
        pressButton("getVolume");
    }

    public void VolumeDownButton() {
        pressButton("getVolume");
        pressButton("volumeDown");
        pressButton("getVolume");
    }

    public void DiagnosticsButton() {
        pressButton("getSecurityCameraStatus");
        pressButton("getTemp");
        pressButton("getVolume");
    }
}
