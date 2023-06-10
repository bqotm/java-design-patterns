package dev.bqot.chain_of_responsibility;

public abstract class Handler implements IHandler {

    private IHandler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    public void handleNext(String req) {
        if(next==null) {
            System.out.println("final handler reached");
            return;
        }
        next.handle(req);
    }

}
