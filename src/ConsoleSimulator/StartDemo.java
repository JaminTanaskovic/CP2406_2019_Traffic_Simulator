package ConsoleSimulator;

public class StartDemo {

    public static void main(String[] args) {
        initializer();
    }

    private static void initializer() {

        Car car = new Car(0, 1);
        TrafficLight trafficLight = new TrafficLight(1, 3);
        Road road1 = new Road(5, 2);
        Road road2 = new Road(5, 1);
        trafficLight.tl(car, trafficLight, road1);
    }
}
