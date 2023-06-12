package dev.bqot.singleton.strategy;

public class PaymentByDigitalWallet implements PaymentStrategy {

    private String publicKey, privateKey;

    @Override
    public void process(String data) {
        System.out.println("["+data+"] collecting wallet info");
    }

}
