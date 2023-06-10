package dev.bqot.chain_of_responsibility;

public class ZMAIN {


    public static void main(String[] args) {
        String request1="aggggggggggggggg";
        Handler handler2=new ConcreteHandler2();
        Handler handler1=new ConcreteHandler(handler2);

        handler1.handle(request1);

    }


}
