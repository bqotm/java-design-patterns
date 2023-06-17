package dev.bqot.visitor;

public class FeedingCostVisitor implements AnimalVisitor {


    int totalCost=0;

    @Override
    public void visitCat(Animal cat) {
        totalCost+=cat.age*cat.capacity;
    }

    @Override
    public void visitDog(Animal dog) {
        totalCost+=dog.age*dog.capacity;
    }

    public int getTotalCost() {
        return totalCost;
    }
}
