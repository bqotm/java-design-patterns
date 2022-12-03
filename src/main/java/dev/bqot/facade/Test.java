package dev.bqot.facade;

public class Test {


    public static void main(String[] args) {

        ScheduleServer scheduleServer=new ScheduleServer();
//        scheduleServer.start();
//        scheduleServer.initContext();
//        scheduleServer.initListeners();
//        scheduleServer.releaseProcesses();
//        scheduleServer.stop();
        SchedulerServerFacade schedulerServerFacade=new SchedulerServerFacade(scheduleServer);
        schedulerServerFacade.start();
        schedulerServerFacade.stop();


    }
}
