package dev.bqot.observer;

public interface Observer {

    void update(String s);
    void subscribe();
    void unsubscribe();
}
