package dev.bqot.singleton;

public class SingletonLazyDoubleCheck {

    private static volatile SingletonLazyDoubleCheck sc=null;

    private SingletonLazyDoubleCheck(){}

    private static SingletonLazyDoubleCheck getInstance(){
        if(sc==null){
            synchronized (SingletonLazyDoubleCheck.class) {
                if(sc==null)
                    sc=new SingletonLazyDoubleCheck();
            }
        }
        return sc;
    }

}
