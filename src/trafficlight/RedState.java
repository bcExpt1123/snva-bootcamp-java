package trafficlight;

public class RedState implements TrafficLightState {
    public void displayState() {
        System.out.println("Traffic light is red");
    }

    public void changeState(TrafficLight trafficLight) {
        // Transition to the next state
        trafficLight.setState(new GreenState());
    }
}