package dev.bqot.chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ConcreteHandler3 extends Handler {

    private final String C="a";

    @Override
    public void handle(String request) {
        if(request.endsWith(C)){
            System.out.println("req handled successfully by handler3");
            return;
        }
        handleNext(request);
    }
}
