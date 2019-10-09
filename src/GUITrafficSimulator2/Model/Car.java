package GUITrafficSimulator2.Model;

import java.awt.*;

public class Car extends Vehicle {

    private int position;
    private int iterationCount = 0;
    private int stopCount = 0;
    private int length = 2;
    private StraightRoad straightRoad1;

    public Car(int position, StraightRoad straightRoad1) {
        super();
        this.position = position;
        this.straightRoad1 = straightRoad1;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        //     g.fillRect(x, y, width, height);
    }

    public StraightRoad getRoad() {
        return straightRoad1;
    }

    public void setRoad(StraightRoad straightRoad) {
        this.straightRoad1 = straightRoad;
    }

    int getLength() {
        return length;
    }

    void move(Car car, TrafficLight trafficLight, StraightRoad straightRoad1, StraightRoad straightRoad2) {

        if (getPosition() < 5) {  //if car position is less then the end traffic lights won't stop it
            setPosition(getPosition() + 1);
            System.out.println("car keeps moving");
            System.out.println("Cars position is " + getPosition() + " on road " + getRoad().getRoadConnector());
            trafficLight.tl(car, trafficLight, straightRoad1, straightRoad2);

        } else if ((getPosition() == 5) && (trafficLight.getColour() == 1) && (getRoad() == straightRoad1)) {
            //if car is in final position and traffic light is green and you are on road 1
            setRoad(straightRoad2);
            setPosition(0);
            System.out.println("car goes to road " + straightRoad2.getRoadConnector());
            System.out.println("Cars position is " + getPosition() + " on road " + getRoad().getRoadConnector());
            trafficLight.tl(car, trafficLight, straightRoad1, straightRoad2);

        } else if ((getPosition() == 5) && (getRoad() == straightRoad2)) {
            iterationCount++;
            int totalIterations = 2;  //total of two iterations
            for (int i = iterationCount; i < totalIterations; i++) {
                setRoad(straightRoad1);
                setPosition(0);
                System.out.println("starting demo run again");
                System.out.println("iteration " + iterationCount);
                move(car, trafficLight, straightRoad1, straightRoad2);
                System.out.println("The car went through " + iterationCount + " iterations");
                System.out.println("the car stopped at the lights " + stopCount + " times");
            }

        } else {
            stopCount++;
            setPosition(5); //if car has red light stay in same spot
            System.out.println("car stays still");
            System.out.println("Cars position is " + getPosition() + " on road " + getRoad().getRoadConnector());
            trafficLight.tl(car, trafficLight, straightRoad1, straightRoad2);
        }
    }
}
