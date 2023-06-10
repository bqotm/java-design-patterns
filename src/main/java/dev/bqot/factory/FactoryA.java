package dev.bqot.factory;

public class FactoryA extends Factory {


    @Override
    IProduct createProduct() {
        return new ProductA();
    }
}
