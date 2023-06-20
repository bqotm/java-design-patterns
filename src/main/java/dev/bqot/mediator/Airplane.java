package dev.bqot.mediator;

public abstract class Airplane {

    protected Mediator mediator;
    protected String serie;

    public Airplane(Mediator mediator, String serie) {
        this.mediator = mediator;
        this.serie = serie;
    }

    abstract void sendSignal(String signal);
    abstract void receiveSignal(String signal);

}
