package dev.bqot.abstract_factory.factories;

import dev.bqot.abstract_factory.products.IProductA;
import dev.bqot.abstract_factory.products.IProductB;
import dev.bqot.abstract_factory.products.ProductA_x;
import dev.bqot.abstract_factory.products.ProductB_x;

public class ConcreteFactoryX extends Company {

    @Override
    public IProductA createProductA() {
        return new ProductA_x();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB_x();
    }
}
