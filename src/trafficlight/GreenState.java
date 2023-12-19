package trafficlight;

public class GreenState implements TrafficLightState {
    public void displayState() {
        System.out.println("Traffic light is green");
    }

    public void changeState(TrafficLight trafficLight) {
        // Transition to the next state
        trafficLight.setState(new YellowState());
    }
}