package dev.bqot.template_method;

public class GTA5Loading extends TemplateGameLoading{
    @Override
    void loadData() {
        System.out.println("loading data from /gta5/bin");
    }

    @Override
    void createObjectsInMemory() {
        System.out.println("""
                creating physics engine... done
                creating raytracing module... done
                ...""");
    }

    @Override
    void loadCurrentProfile() {
        System.out.println("Loading current gamer(trevorpi) profile...");
    }
}
