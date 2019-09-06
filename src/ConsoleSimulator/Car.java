package ConsoleSimulator;

class Car {

    private int position;
    private int road;
    private int iterationCount = 0;
    private int stopCount = 0;

    Car(int position, int road) {
        this.position = position;
        this.road = road;
    }

    int getPosition() {
        return position;
    }

    void setPosition(int position) {
        this.position = position;
    }

    int getRoad() {
        return road;
    }

    void setRoad(int road) {
        this.road = road;
    }

    void move(Car car, TrafficLight trafficLight, Road road) {

        if (car.getPosition() < 5) {  //if car position is less then the end
            car.setPosition(getPosition() + 1);
            System.out.println("car keeps moving");
            System.out.println("Cars position is " + car.getPosition() + " on road " + car.getRoad());
            trafficLight.tl(car, trafficLight, road);

        } else if ((car.getPosition() == 5) && (trafficLight.getColour() == 1) && (car.getRoad() == 1)) {
            //if car is in final position and traffic light is green and you are on road 1
            car.setRoad(2);
            car.setPosition(0);
            System.out.println("car goes to road " + road.getRoadConnector());
            System.out.println("Cars position is " + car.getPosition() + " on road " + car.getRoad());
            trafficLight.tl(car, trafficLight, road);

        } else if ((car.getPosition() == 5) && (car.getRoad() == 2)) {
            iterationCount++;
            //total of two iterations
            int totalIterations = 2;
            for (int i = iterationCount; i < totalIterations; i++) {
                car.setRoad(1);
                car.setPosition(0);
                System.out.println("starting demo run again");
                System.out.println("iteration " + iterationCount);
                move(car, trafficLight, road);
            }
            System.out.println("The car went through " + iterationCount + " iterations");
            System.out.println("the car stopped at the lights " + stopCount + " times");

        } else {
            stopCount++;
            car.setPosition(5); //if car has red light stay in same spot
            System.out.println("car stays still");
            System.out.println("Cars position is " + car.getPosition() + " on road " + car.getRoad());
            trafficLight.tl(car, trafficLight, road);
        }

    }
}
