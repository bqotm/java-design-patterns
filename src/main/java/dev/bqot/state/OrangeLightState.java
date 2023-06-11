package dev.bqot.state;

public class OrangeLightState extends TrafficLightState{


    @Override
    void performAction() {
        System.out.println("PREPATE TO STOP");
        this.trafficLight.setTrafficLightState(new RedLightState());
    }
}
