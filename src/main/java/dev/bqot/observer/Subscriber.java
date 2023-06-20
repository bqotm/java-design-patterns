package dev.bqot.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Subscriber implements Observer{

    private String name;

    @Override
    public void update(String channel, String videoTitle) {
        System.out.println(this.name+" received notif about video [ "+videoTitle+" ] from channel ("+channel+")");
    }
}
