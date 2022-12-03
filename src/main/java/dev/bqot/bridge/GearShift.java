package dev.bqot.bridge;

public class GearShift implements Product {

    private String productName;

    public GearShift(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return this.productName;
    }

    @Override
    public void produce() {
        System.out.println("producing a manual shifting system.");
    }
}
