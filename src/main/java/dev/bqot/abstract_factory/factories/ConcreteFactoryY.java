package dev.bqot.abstract_factory.factories;

import dev.bqot.abstract_factory.products.IProductA;
import dev.bqot.abstract_factory.products.IProductB;
import dev.bqot.abstract_factory.products.ProductA_y;

public class ConcreteFactoryY extends Company {

    @Override
    public IProductA createProductA() {
        return new ProductA_y();
    }

    @Override
    public IProductB createProductB() {
        return null;
    }
}
