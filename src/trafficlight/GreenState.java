package trafficlight;

public class GreenState implements TrafficLightState {
    @Override
    public void displayState() {
        System.out.println("Traffic light is green");
    }

    @Override
    public void changeState(TrafficLight trafficLight) {
        // Transition to the next state
        trafficLight.setState(new YellowState());
    }
}