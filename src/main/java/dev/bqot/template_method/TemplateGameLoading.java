package dev.bqot.template_method;

public abstract class TemplateGameLoading {


    public void load() {
        checkMemoryUsage();
        loadData();
        createObjectsInMemory();
        loadCurrentProfile();
        clearTmpFiles();
    }

    void checkMemoryUsage() {
        System.out.println("checking memory usage and space availability...");
    }
    abstract void loadData();
    abstract void createObjectsInMemory();

    void clearTmpFiles() {
        System.out.println("cleaing temporary files...");
    }
    abstract void loadCurrentProfile();

}
