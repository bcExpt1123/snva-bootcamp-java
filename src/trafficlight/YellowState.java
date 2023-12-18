package trafficlight;

public class YellowState implements TrafficLightState {
    @Override
    public void displayState() {
        System.out.println("Traffic light is yellow");
    }

    @Override
    public void changeState(TrafficLight trafficLight) {
        // Transition to the next state
        trafficLight.setState(new RedState());
    }
}