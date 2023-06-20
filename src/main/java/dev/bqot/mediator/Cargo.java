package dev.bqot.mediator;

public class Cargo extends Airplane{


    public Cargo(Mediator mediator, String serie) {
        super(mediator, serie);
    }

    @Override
    public void sendSignal(String signal) {
        System.out.println("Hello this is me Cargo "+this.serie+" sending: "+signal);
        this.mediator.execute(signal, this);
    }

    @Override
    public void receiveSignal(String signal) {
        System.out.println("Cargo "+this.serie+" : RECEIVED signal :"+signal);
    }
}
