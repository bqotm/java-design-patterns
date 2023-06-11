package dev.bqot.state;

public class RedLightState extends TrafficLightState {


    @Override
    void performAction() {
        System.out.println("STOP");
        this.trafficLight.setTrafficLightState(new GreenLightState());
    }
}
