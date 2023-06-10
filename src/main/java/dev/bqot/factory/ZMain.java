package dev.bqot.factory;

public class ZMain {

    public static void main(String[] args) {
        Factory factoryA=new FactoryA();
        ProductA productA= (ProductA) factoryA.orderProduct();

        Factory factoryB=new FactoryB();
        ProductB productB= (ProductB) factoryB.orderProduct();
    }
}
