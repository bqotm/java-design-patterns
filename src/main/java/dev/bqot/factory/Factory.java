package dev.bqot.factory;

public abstract class Factory {

    public IProduct orderProduct() {
        IProduct product = createProduct();
        product.prepare();
        return product;
    }

    abstract IProduct createProduct();

}
