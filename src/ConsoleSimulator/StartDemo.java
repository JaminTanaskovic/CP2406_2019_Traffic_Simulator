package ConsoleSimulator;

public class StartDemo {

    public static void main(String[] args) {
        initializer();
    }

    private static void initializer() {

        TrafficLight trafficLight = new TrafficLight(1, 3);
        Road road1 = new Road(5, 1);
        Road road2 = new Road(5, 2);
        Car car = new Car(0, road1);
        MotorBike motorBike = new MotorBike(0, road1);
        Bus bus = new Bus(0, road1);
        trafficLight.tl(car, trafficLight, road1, road2);
    }
}
