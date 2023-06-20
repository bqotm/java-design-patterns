package dev.bqot.mediator;

public class Jet extends Airplane{


    public Jet(Mediator mediator, String serie) {
        super(mediator, serie);
    }

    @Override
    public void sendSignal(String signal) {
        System.out.println("Hello this is me Jet "+this.serie+" sending: "+signal);
        mediator.execute(signal, this);
    }

    @Override
    public void receiveSignal(String signal) {
        System.out.println("Jet "+this.serie+" : RECEIVED signal :"+signal);
    }
}
