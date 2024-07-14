public class VolumeDownCommand implements Command {
    private MusicPlayer musicPlayer;

    public VolumeDownCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public boolean ToExecute() {
        return true;
    }

    @Override
    public boolean canExecute() {
        return false;
    }

    public String execute() {
        if (!ToExecute())
            return null;

        return this.musicPlayer.decreaseVolume();
    }
}
