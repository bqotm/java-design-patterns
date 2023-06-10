package dev.bqot.chain_of_responsibility;

public class ZMAIN {


    public static void main(String[] args) {
        String request1="ggggggggggggggga";
        Handler handler3=new ConcreteHandler3();
        Handler handler2=new ConcreteHandler2();
        Handler handler1=new ConcreteHandler();
        handler1.setNextHandler(handler2).setNextHandler(handler3);

        handler1.handle(request1);

    }


}
