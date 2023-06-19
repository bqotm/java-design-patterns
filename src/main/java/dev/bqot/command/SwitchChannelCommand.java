package dev.bqot.command;

public class SwitchChannelCommand implements Command {

    private Television television;

    public SwitchChannelCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute(String... args) {
        int channel=Integer.parseInt(args[0]);
        this.television.setChannel(channel);
    }
}
