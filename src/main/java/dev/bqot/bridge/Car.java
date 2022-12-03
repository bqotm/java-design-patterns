package dev.bqot.bridge;

public abstract class Car {

    protected String carType;

    protected Product product;


    public Car(Product product,String carType){
        this.product = product;
        this.carType = carType;
    }

    public abstract void assemble();
    public abstract void produceProduct();
    public void printDetails(){
        System.out.println("Car: "+carType+", Product:"+product.productName());
    }

}
