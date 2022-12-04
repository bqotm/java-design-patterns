package dev.bqot.observer;

import java.util.List;

public class CommentarySubject implements Subject, Commentary {

    private List<Observer> observers;
    private String desc;
    private String subjectDetails;

    public CommentarySubject(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.desc=desc;
        this.notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(desc);
        }
    }

    @Override
    public String subjectDetails() {
        return this.subjectDetails;
    }
}
