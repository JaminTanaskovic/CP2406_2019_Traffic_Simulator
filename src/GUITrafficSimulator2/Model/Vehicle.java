package GUITrafficSimulator2.Model;

import java.awt.*;

public abstract class Vehicle {
    protected int x, y;
    protected int xDir, yDir; // -1, 0, 1
    protected int speed;
    protected int position;
    protected Road road1;

    Vehicle(int position, int x, int y, int xDir, int yDir) {
        assert x > 0 : "invalid x value, must be zero or more";
        this.position = position;
        this.x = x;
        this.y = y;
        this.xDir = xDir;
        this.yDir = yDir;
        this.road1 = road1;
    }

    public Vehicle() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxDir() {
        return xDir;
    }

    public void setxDir(int xDir) {
        this.xDir = xDir;
    }

    public int getyDir() {
        return yDir;
    }

    public void setyDir(int yDir) {
        this.yDir = yDir;
    }

    public int getSpeed() {
        return speed;
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

    public boolean equals(Object obj) {
        if (obj instanceof GUITrafficSimulator2.Model.Vehicle) {
            GUITrafficSimulator2.Model.Vehicle other = (GUITrafficSimulator2.Model.Vehicle) obj;
            return this.x == other.x && this.y == other.y;
        }
        return false;
    }

  /*  public void move(Car car, TrafficLight trafficLight, StraightRoad road1, StraightRoad road2) {
        x += speed * xDir;
        y += speed * yDir;
    }*/

    public void move(Car car, TrafficLight trafficLight, StraightRoad road1, StraightRoad road2) {
        if (getPosition() < road1.getRoadLength()) {  //if car position is less then the end traffic lights won't stop it
            setPosition(getPosition() + 1);
            System.out.println("car keeps moving");
            System.out.println("Cars position is " + getPosition() + " on road " + getRoad().getConnector());
            trafficLight.tl(car, trafficLight, road1, road2);

        } else if ((getPosition() == 5) && (trafficLight.getColour() == 1) && (getRoad() == road1)) {
            //if car is in final position and traffic light is green and you are on road 1
            setRoad(road2);
            setPosition(0);
            System.out.println("car goes to road " + road2.getConnector());
            System.out.println("Cars position is " + getPosition() + " on road " + getRoad().getConnector());
            trafficLight.tl(car, trafficLight, road1, road2);

        } else {
            setPosition(5); //if car has red light stay in same spot
            System.out.println("car stays still");
            System.out.println("Cars position is " + getPosition() + " on road " + getRoad().getConnector());
            trafficLight.tl(car, trafficLight, road1, road2);
        }
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void draw(Graphics g);
}
