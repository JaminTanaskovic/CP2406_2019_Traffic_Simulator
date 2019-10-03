package GUITrafficSimulator2.Model;

import java.util.Random;

class TrafficLight {

    private int colour;
    private int changeCount;
    private Random rand = new Random();

    TrafficLight(int colour, int changeCount) {
        this.colour = colour;
        this.changeCount = changeCount;
    }

    int getColour() {
        return colour;
    }

    void setColour(int colour) {
        this.colour = colour;
    }

    int getChangeCount() {
        return changeCount;
    }

    void setChangeCount(int changeCount) {
        this.changeCount = changeCount;
    }

    void tl(Car car, TrafficLight trafficLight, StraightRoad straightRoad1, StraightRoad straightRoad2) {
        int randInt = rand.nextInt(2);
        if (randInt == 0) {
            trafficLight.setColour(0); //red
            System.out.println("light is red");
        } else if (randInt == 1) {
            trafficLight.setColour(1); //green
            System.out.println("light is green");
        }
        car.move(car, trafficLight, straightRoad1, straightRoad2);
    }
}
