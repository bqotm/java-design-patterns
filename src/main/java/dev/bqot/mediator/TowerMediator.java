package dev.bqot.mediator;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TowerMediator implements Mediator {

    private List<Airplane> airplanes;

    public void addAirplane(Airplane airplane) {
        this.airplanes.add(airplane);
    }

    @Override
    public void execute(String signal, Airplane airplane) {

        for(Airplane a : this.airplanes) {
            if(a!=airplane){
                a.receiveSignal(signal);
            }
        }

    }

}
