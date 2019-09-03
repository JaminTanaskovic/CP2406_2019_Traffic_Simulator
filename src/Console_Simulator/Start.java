package Console_Simulator;

public class Start {

    public static void main(String[] args) {
        startDemo();
    }

    private static void startDemo() {
        Car car = new Car(2, 0);
        TrafficLight trafficLight = new TrafficLight(1);
        Road roadA = new Road(6, true);
        Road roadB = new Road(6, false);
    }
}
