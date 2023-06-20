package dev.bqot.memento;

import lombok.Setter;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Editor {

    private TextArea textArea;
    private Queue<TextArea.Memento> history;

    public Editor() {
        this.textArea = new TextArea();
        this.history = new LinkedList<>();
    }

    public void write(String text) {
        this.textArea.setText(text);
        this.history.add(this.textArea.save());
    }

    public void undo(){
        this.textArea.restore(Objects.requireNonNull(this.history.poll()));
    }

    public void print(){
        System.out.println(this.textArea.getText());
    }

}
