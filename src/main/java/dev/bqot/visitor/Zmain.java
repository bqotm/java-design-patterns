package dev.bqot.visitor;

public class Zmain {


    public static void main(String[] args) {

        Cat cat = new Cat(2, 1);
        Dog dog = new Dog(3, 3);

        FeedingCostVisitor animalVisitor=new FeedingCostVisitor();
        cat.accept(animalVisitor);
        dog.accept(animalVisitor);

        System.out.println(animalVisitor.getTotalCost());

    }

}
