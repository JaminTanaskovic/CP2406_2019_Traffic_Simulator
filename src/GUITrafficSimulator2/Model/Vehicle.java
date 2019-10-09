package GUITrafficSimulator2.Model;

import java.awt.*;

public abstract class Vehicle {
    protected int x, y;
    protected int xDir, yDir; // -1, 0, 1
    protected int speed;
    protected int position;
    protected Road road1;
    protected Color color;

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

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void draw(Graphics g);
}
