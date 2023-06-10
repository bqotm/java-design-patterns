package dev.bqot.chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class ConcreteHandler2 implements Handler{

    private Handler next;

    private final String C="a";

    @Override
    public void handle(String request) {
        if(request.startsWith(C)){
            System.out.println("req handled successfully by handler2");
            return;
        }
        next.handle(request);
    }
}
