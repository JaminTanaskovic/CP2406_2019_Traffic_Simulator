package ConsoleSimulator;

class Car {

    private int position;
    private int iterationCount = 0;
    private int stopCount = 0;
    private int length = 2;
    private Road road1;

    Car(int position, Road road1) {
        this.position = position;
        this.road1 = road1;
    }

    int getPosition() {
        return position;
    }

    void setPosition(int position) {
        this.position = position;
    }

    Road getRoad() {
        return road1;
    }

    void setRoad(Road road) {
        this.road1 = road;
    }

    int getLength() {
        return length;
    }

    void move(Car car, TrafficLight trafficLight, Road road1, Road road2) {

        if (getPosition() < 5) {  //if car position is less then the end traffic lights won't stop it
            setPosition(getPosition() + 1);
            System.out.println("car keeps moving");
            System.out.println("Cars position is " + getPosition() + " on road " + getRoad().getRoadConnector());
            trafficLight.tl(car, trafficLight, road1, road2);

        } else if ((getPosition() == 5) && (trafficLight.getColour() == 1) && (getRoad() == road1)) {
            //if car is in final position and traffic light is green and you are on road 1
            setRoad(road2);
            setPosition(0);
            System.out.println("car goes to road " + road2.getRoadConnector());
            System.out.println("Cars position is " + getPosition() + " on road " + getRoad().getRoadConnector());
            trafficLight.tl(car, trafficLight, road1, road2);

        } else if ((getPosition() == 5) && (getRoad() == road2)) {
            iterationCount++;
            int totalIterations = 2;  //total of two iterations
            for (int i = iterationCount; i < totalIterations; i++) {
                setRoad(road1);
                setPosition(0);
                System.out.println("starting demo run again");
                System.out.println("iteration " + iterationCount);
                move(car, trafficLight, road1, road2);
                System.out.println("The car went through " + iterationCount + " iterations");
                System.out.println("the car stopped at the lights " + stopCount + " times");
            }

        } else {
            stopCount++;
            setPosition(5); //if car has red light stay in same spot
            System.out.println("car stays still");
            System.out.println("Cars position is " + getPosition() + " on road " + getRoad().getRoadConnector());
            trafficLight.tl(car, trafficLight, road1, road2);
        }
    }
}
