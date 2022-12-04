package dev.bqot.singleton;

public class SingletonLazyMultiThreaded {

    private static SingletonLazyMultiThreaded sc=null;
    private SingletonLazyMultiThreaded() {}

    public synchronized static SingletonLazyMultiThreaded getInstance(){
        if(sc==null)
            sc=new SingletonLazyMultiThreaded();
        return sc;
    }

}
