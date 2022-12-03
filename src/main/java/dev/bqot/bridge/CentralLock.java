package dev.bqot.bridge;

public class CentralLock implements Product {

    private String productName;

    public CentralLock(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return this.productName;
    }

    @Override
    public void produce() {
        System.out.println("producing a central locking system.");
    }
}
