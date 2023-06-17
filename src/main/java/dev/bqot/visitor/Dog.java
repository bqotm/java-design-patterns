package dev.bqot.visitor;

public class Dog extends Animal {


    public Dog(int capacity, int age) {
        super(capacity, age);
    }

    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visitDog(this);
    }

}
