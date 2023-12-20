package trafficlight;

/**
 * Design a system that simulates
 * a traffic light.
 * How would you use interfaces,
 * classes, and polymorphism to
 * represent the different states
 * of the traffic light and facilitate state transitions?
 */

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.displayState();

        trafficLight.changeState();
        trafficLight.displayState();

        trafficLight.changeState();
        trafficLight.displayState();

        trafficLight.changeState();
        trafficLight.displayState();
    }
}