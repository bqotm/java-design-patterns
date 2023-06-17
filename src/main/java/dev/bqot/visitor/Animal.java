package dev.bqot.visitor;

public abstract class Animal {

    protected int capacity;
    protected int age;

    public Animal(int capacity, int age){
        this.capacity=capacity;
        this.age=age;
    }

    abstract void accept(AnimalVisitor animalVisitor);

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
