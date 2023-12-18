package trafficlight;

public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        // Set the initial state
        this.currentState = new GreenState();
    }

    public void displayState() {
        currentState.displayState();
    }

    public void changeState() {
        currentState.changeState(this);
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }
}