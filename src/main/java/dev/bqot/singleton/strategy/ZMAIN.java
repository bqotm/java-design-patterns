package dev.bqot.singleton.strategy;

public class ZMAIN {


    public static void main(String[] args) {

        PaymentService paymentService=new PaymentService();
        PaymentStrategy paymentStrategy=new PaymentByCreditCard();
        paymentService.setPaymentStrategy(paymentStrategy);
        paymentService.execPayment("cat");
        paymentService.setPaymentStrategy(new PaymentByDigitalWallet());
        paymentService.execPayment("dog");

    }

}
