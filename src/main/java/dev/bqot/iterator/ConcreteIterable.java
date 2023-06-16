package dev.bqot.iterator;

public class ConcreteIterable<T> implements IterableCollection<T> {

    private int index=0;
    private T[] elements;


    @Override
    public Iteratoor<T> createIterator() {
        return new ConcreteIteratoor<T>(this);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }
}
