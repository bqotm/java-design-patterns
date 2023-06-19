package dev.bqot.template_method;

public class ChessLoading extends TemplateGameLoading{
    @Override
    void loadData() {
        System.out.println("loading chess set...");
    }

    @Override
    void createObjectsInMemory() {
        System.out.println("loading all pieces but the horsey...");
        System.out.println("horsey refuses to load unless he know how he moves...");
    }

    @Override
    void loadCurrentProfile() {
        System.out.println("anand is the best ! change my mind...");
    }
}
