package dev.bqot.facade;

public class SchedulerServerFacade {

    final ScheduleServer scheduleServer;

    public SchedulerServerFacade(ScheduleServer scheduleServer) {
        this.scheduleServer = scheduleServer;
    }

    public void start(){
        this.scheduleServer.start();
        this.scheduleServer.initContext();
        this.scheduleServer.initListeners();
    }

    public void stop(){
        this.scheduleServer.releaseProcesses();
        this.scheduleServer.stop();
    }

    public void stopF(){
        this.scheduleServer.stop();
    }

}
