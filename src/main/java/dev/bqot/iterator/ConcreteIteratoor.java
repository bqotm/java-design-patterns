package dev.bqot.iterator;

public class ConcreteIteratoor<T> implements Iteratoor<T> {

    private ConcreteIterable<T> concreteIterable;

    public ConcreteIteratoor(ConcreteIterable<T> concreteIterable) {
        this.concreteIterable=concreteIterable;
    }

    @Override
    public T getNext() {
        int current=concreteIterable.getIndex();
        T t=concreteIterable.getElements()[current];
        concreteIterable.setIndex(++current);
        return t;
    }

    @Override
    public boolean hasNext() {
        return concreteIterable.getIndex()<concreteIterable.getElements().length;
    }
}
