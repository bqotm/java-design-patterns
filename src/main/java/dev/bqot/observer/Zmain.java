package dev.bqot.observer;

public class Zmain {

    public static void main(String[] args) {

        YoutubeChannel speed=new YoutubeChannel("ilackspeed");

        Subscriber alice=new Subscriber("alice");
        Subscriber bob=new Subscriber("bob");
        Subscriber eve=new Subscriber("eve");

        speed.subscribe(alice);
        speed.subscribe(bob);
        speed.subscribe(eve);

        speed.notifySubs("finally i've met lord bendtner !");

        speed.unsubscribe(bob);

        speed.notifySubs("lakaka is the goat");

    }
}
