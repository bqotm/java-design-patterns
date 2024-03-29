package dev.bqot.chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ConcreteHandler2 extends Handler{

    private final String C="a";

    @Override
    public void handle(String request) {
        if(request.startsWith(C)){
            System.out.println("req handled successfully by handler2");
            return;
        }
        handleNext(request);
    }
}
