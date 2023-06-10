package dev.bqot.factory;

public class ProductA implements IProduct {


    @Override
    public void prepare() {
        System.out.println("preparing product A");
    }

}
