package dev.bqot.iterator;

public class Zmain {


    public static void main(String[] args) {

        ConcreteIterable<String> concreteIterable=new ConcreteIterable<>();
        Iteratoor<String> iterator=concreteIterable.createIterator();
        concreteIterable.setElements(new String[]{"A", "BB", "CCC","D"});
        while(iterator.hasNext()){
            System.out.println(iterator.getNext());
        }

    }


}
