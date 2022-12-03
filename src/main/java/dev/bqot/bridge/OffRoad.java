package dev.bqot.bridge;

public class OffRoad extends Car {

    public OffRoad(Product product, String carType) {
        super(product, carType);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling "+product.productName()+" for "+carType);
    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modifing product "+product.productName()+" according to - "+carType);
    }
}
