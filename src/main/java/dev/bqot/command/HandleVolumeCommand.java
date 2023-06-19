package dev.bqot.command;

public class HandleVolumeCommand implements Command {

    private Television television;

    public HandleVolumeCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute(String... args) {
        int volume= television.getVolume();
        if(args[0]=="UP") {
            television.setVolume(++volume);
        }
        if(args[0]=="DOWN") {
            television.setVolume(--volume);
        }
    }

}
