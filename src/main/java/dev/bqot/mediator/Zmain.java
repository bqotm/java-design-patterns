package dev.bqot.mediator;

import java.util.ArrayList;

public class Zmain {


    public static void main(String[] args) {

        TowerMediator mediator=new TowerMediator(new ArrayList<>());
        Airplane cargo1 = new Cargo(mediator, "C01");
        Airplane cargo2 = new Cargo(mediator, "C02");
        Airplane jet1 = new Jet(mediator, "J1");
        mediator.addAirplane(cargo1);
        mediator.addAirplane(cargo2);
        mediator.addAirplane(jet1);

        cargo2.sendSignal("i am at alt 3z, 40m away from landing stage");
        jet1.sendSignal("wait wait ! i'm on my exit");

    }

}
