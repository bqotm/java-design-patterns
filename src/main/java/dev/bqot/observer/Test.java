package dev.bqot.observer;

import java.util.ArrayList;

public class Test {



    public static void main(String[] args) {

        Subject subject=new CommentarySubject(new ArrayList<>(), "WC2022");
        Observer observer1=new SMSUser(subject, "Aivan [Prussia]");
        observer1.subscribe();
        Observer observer2=new SMSUser(subject, "Van rijn [Deutsch]");
        observer2.subscribe();
        Commentary commentary=(Commentary)subject;
        commentary.setDesc("WC Opening is live");
        commentary.setDesc("ENGLAND VS SENEGAL - 3 : 0");
        observer1.unsubscribe();
        commentary.setDesc("ARGENTINA WINS THE WC");
        Observer observer3=new SMSUser(subject, "Voynich [Austria]");
        observer3.subscribe();
        commentary.setDesc("Breaking news : wc never was, so does everything around ! everything is an illusion. Wake up people");


    }

}
