package dev.bqot.command;

public class Zmain {


    public static void main(String[] args) {

        Television tv = new Television(1, 10, true);
        System.out.println(tv);
        RemoteController remote=new RemoteController(new HandleVolumeCommand(tv));
        remote.executeCommand("UP");
        System.out.println(tv);
        remote.setCommand(new SwitchChannelCommand(tv));
        remote.executeCommand("386");
        System.out.println(tv);
        remote.setCommand(new SwitchPowerCommand(tv));
        remote.executeCommand();
        System.out.println(tv);

    }

}
