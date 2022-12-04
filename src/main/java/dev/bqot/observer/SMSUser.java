package dev.bqot.observer;

public class SMSUser implements Observer {

    private Subject subject;
    private String desc;
    private String userInfo;

    public SMSUser(Subject subject, String userInfo) {
        if(subject==null){
            throw new IllegalArgumentException("No Publisher found.");
        }
        this.subject = subject;
        this.userInfo = userInfo;
    }

    @Override
    public void update(String s) {
        this.desc = s;
        System.out.println("["+userInfo+"]: "+desc);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing "+userInfo+" to "+subject.subjectDetails()+ " ...");
        this.subject.subscribe(this);
        System.out.println("Subscribed successfully.");
    }

    @Override
    public void unsubscribe() {
        System.out.println("Unsubscribing "+userInfo+" to "+subject.subjectDetails()+ " ...");
        this.subject.unsubscribe(this);
        System.out.println("Unsubscribed successfully.");
    }
}
