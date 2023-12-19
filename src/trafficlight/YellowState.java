package trafficlight;

public class YellowState implements TrafficLightState {
    public void displayState() {
        System.out.println("Traffic light is yellow");
    }

    public void changeState(TrafficLight trafficLight) {
        // Transition to the next state
        trafficLight.setState(new RedState());
    }
}