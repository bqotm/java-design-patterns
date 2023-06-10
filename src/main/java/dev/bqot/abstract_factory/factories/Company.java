package dev.bqot.abstract_factory.factories;

import dev.bqot.abstract_factory.products.IProductA;
import dev.bqot.abstract_factory.products.IProductB;

public abstract class Company {


    public abstract IProductA createProductA();

    public abstract IProductB createProductB();

}
