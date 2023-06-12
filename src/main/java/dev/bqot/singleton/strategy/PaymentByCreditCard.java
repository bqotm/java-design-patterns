package dev.bqot.singleton.strategy;

public class PaymentByCreditCard implements PaymentStrategy {

    private String ccv;

    @Override
    public void process(String data) {
        System.out.println("["+data+"] collecting credit card info");
    }
}
