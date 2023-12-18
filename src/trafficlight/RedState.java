package trafficlight;

public class RedState implements TrafficLightState {
    @Override
    public void displayState() {
        System.out.println("Traffic light is red");
    }

    @Override
    public void changeState(TrafficLight trafficLight) {
        // Transition to the next state
        trafficLight.setState(new GreenState());
    }
}