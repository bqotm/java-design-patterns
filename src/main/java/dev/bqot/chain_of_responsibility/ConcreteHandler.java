package dev.bqot.chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ConcreteHandler extends Handler{


    private final int N=8;

    @Override
    public void handle(String request) {
        if(request.length()<8){
            System.out.println("req handled successfully by handler1");
            return;
        }
        handleNext(request);
    }
}
