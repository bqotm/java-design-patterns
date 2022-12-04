package dev.bqot.singleton;

public class SingletonEager {

    private static SingletonEager sc=new SingletonEager();
    private SingletonEager() {}

    public static SingletonEager getInstance(){
        return sc;
    }

}
