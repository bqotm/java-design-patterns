package dev.bqot.state;

public class TrafficLight {

    private TrafficLightState trafficLightState;

    public TrafficLight(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }

    public TrafficLight() {
        trafficLightState = new RedLightState();
    }

    public void setTrafficLightState(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }

    public void performAction() {
        trafficLightState.setTrafficLight(this);
        trafficLightState.performAction();
    }
}
