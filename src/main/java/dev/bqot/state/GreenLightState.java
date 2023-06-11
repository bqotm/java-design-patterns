package dev.bqot.state;

public class GreenLightState extends TrafficLightState{


    @Override
    void performAction() {
        System.out.println("GO");
        this.trafficLight.setTrafficLightState(new OrangeLightState());
    }
}
