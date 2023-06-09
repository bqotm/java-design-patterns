package dev.bqot.singleton;

public class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        Singleton instance=singleton;
        if(instance == null) {
            synchronized (Singleton.class) {
                instance = singleton;
                if (instance == null) {
                    instance = singleton = new Singleton();
                }
            }
        }
        return instance;
    }
}
