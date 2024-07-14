public class VolumeUpCommand implements Command {
    private MusicPlayer musicPlayer;

    public VolumeUpCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public boolean canExecute() {
        return true;
    }

    public String execute() {
        if (!canExecute())
            return null;

        return this.musicPlayer.increaseVolume();
    }
}