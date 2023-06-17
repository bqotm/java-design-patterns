package dev.bqot.visitor;

public class Cat extends Animal {

    public Cat(int capacity, int age) {
        super(capacity, age);
    }

    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visitCat(this);
    }
}
