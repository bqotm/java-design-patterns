package dev.bqot.factory;

public class ProductB implements IProduct {

    @Override
    public void prepare() {
        System.out.println("preparing product B");
    }
}
