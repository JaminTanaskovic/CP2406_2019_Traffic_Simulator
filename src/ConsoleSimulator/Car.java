package ConsoleSimulator;

import GUITrafficSimulator2.Model.Vehicle;

import java.awt.*;

class Car extends Vehicle {

    private int position;
    private int length = 2;
    private Road road1;

    public Car(int position, int x, int y, int xDir, int yDir) {
        this.position = position;
        this.x = x;
        this.y = y;
        this.xDir = xDir;
        this.yDir = yDir;
        this.road1 = road1;
        this.length = length;

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

    @Override
    public void draw(Graphics g) {
    }

    void setRoad(Road road) {
        this.road1 = road;
    }

    int getLength() {
        return length;
    }

}
