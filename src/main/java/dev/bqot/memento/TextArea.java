package dev.bqot.memento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TextArea {

    private String text; //state

    public Memento save() {
        return new Memento(this.text);
    }

    public void restore(Memento memento){
        this.text=memento.state;
    }



    public static class Memento {
        private String state;

        private Memento(String state) {
            this.state=state;
        }

        private String getState() {
            return this.state;
        }
    }

}
