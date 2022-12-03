package dev.bqot.facade;




public class ScheduleServer {

    int state;

    public ScheduleServer() {
        this.state = 0;
    }

    public int getState() {
        return state;
    }

    public void start(){
        System.out.println("booting...");
        state=1;
    }

    public void initContext(){
        System.out.println("initializing context...");
        state=2;
    }

    public void initListeners(){
        System.out.println("initializing listeners...");
        state=3;
    }

    public void releaseProcesses(){
        System.out.println("releasing processes...");
        state=-1;
    }

    public void stop() {
        System.out.print("server stoping...");
        if(state==-1)
            System.out.print("server successfully stopped.");
        else
            throw new RuntimeException("server failed to stop ! release proccesses first");
    }


}
