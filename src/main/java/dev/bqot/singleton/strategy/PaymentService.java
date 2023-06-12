package dev.bqot.singleton.strategy;

public class PaymentService {

    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void execPayment(String data) {
        System.out.println("payment proc started...");
        this.paymentStrategy.process(data);
        System.out.println("Payment proc finished successfully !");
    }
}
