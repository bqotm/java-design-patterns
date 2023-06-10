package dev.bqot.factory;

public class FactoryB extends Factory{
    @Override
    IProduct createProduct() {
        return new ProductB();
    }
}
