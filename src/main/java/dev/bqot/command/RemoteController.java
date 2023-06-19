package dev.bqot.command;

public class RemoteController {

    private Command command;

    public RemoteController(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(String... args) {
        this.command.execute(args);
    }
}
