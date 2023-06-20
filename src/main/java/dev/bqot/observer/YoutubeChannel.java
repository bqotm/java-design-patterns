package dev.bqot.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    private String channelName;
    private List<Observer> subscribers;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifySubs(String videoTitle) {
        this.subscribers.forEach(observer -> observer.update(this.channelName, videoTitle));
    }
}
