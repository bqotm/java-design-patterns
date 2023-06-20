package dev.bqot.memento;

public class Zmain {


    public static void main(String[] args) {
        Editor editor=new Editor();
        editor.write("cat is the best");
        editor.write("miaw");
        editor.write("mistake");
        editor.undo();
        editor.undo();
        editor.print();
    }

}
