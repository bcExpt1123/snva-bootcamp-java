package trafficlight;

import trafficlight.TrafficLight;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.displayState();  // Output: "Traffic light is green"

        trafficLight.changeState();
        trafficLight.displayState();  // Output: "Traffic light is yellow"

        trafficLight.changeState();
        trafficLight.displayState();  // Output: "Traffic light is red"

        trafficLight.changeState();
        trafficLight.displayState();  // Output: "Traffic light is green"
    }
}