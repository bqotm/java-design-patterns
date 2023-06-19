package dev.bqot.command;

public class SwitchPowerCommand implements Command {

    private Television television;

    public SwitchPowerCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute(String... args) {
        this.television.setOn(!this.television.isOn());
    }
}
