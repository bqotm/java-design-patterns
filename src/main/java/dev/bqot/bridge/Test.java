package dev.bqot.bridge;

public class Test {



    public static void main(String[] args) {
        Product productCentralLock = new CentralLock("Central Locking System");
        Product productGearShift = new GearShift("Gear Locking System");
        Car car = new EV(productCentralLock , "Electric V1");
        car.produceProduct();
        car.assemble();
        car.printDetails();

    }



}
