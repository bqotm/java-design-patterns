package dev.bqot.state;

public abstract class TrafficLightState {

    protected TrafficLight trafficLight;

    void setTrafficLight(TrafficLight trafficLight) {
        this.trafficLight=trafficLight;
    }

    abstract void performAction();
}
