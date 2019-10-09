package GUITrafficSimulator2.Model2;

import java.awt.*;

public abstract class Vehicle2 {
    int x, y;
    int xDir, yDir; // -1, 0, 1
    int speed;
    Color color;

    Vehicle2(int x, int y, int xDir, int yDir, Color color) {
        assert x > 0 : "invalid x value, must be zero or more";
        this.x = x;
        this.y = y;
        this.xDir = xDir;
        this.yDir = yDir;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%d %d", x, y);
    }

    public void move() {
        if ((canTurn() == false) && (hasTrafficLight() == false)) {
            setSpeed(2);
            x += speed * xDir;
            y += speed * yDir;

        } else if ((canTurn() == false) && (hasTrafficLight() == true) && (lightColor() == "Green")) {
            setSpeed(2);
            x += speed * xDir;
            y += speed * yDir;

        } else if ((canTurn() == true) && (hasTrafficLight() == false)) {
            determineTurn();
            setSpeed(2);

        } else if ((canTurn() == true) && (hasTrafficLight() == true) && (lightColor() == "Green")) {
            determineTurn();
            setSpeed(2);

        } else if ((canTurn() == true) && (hasTrafficLight() == true) && (lightColor() == "Red")) {
            setSpeed(0);

        } else if ((canTurn() == false) && (hasTrafficLight() == true) && (lightColor() == "Red")) {
            setSpeed(0);

        }
    }

    private void determineTurn() {
    }

    private String lightColor() {
        return "Green";
    }

    private boolean hasTrafficLight() {
        return false;
    }

    private boolean canTurn() {
        return false;
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

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract boolean terminate(int width, int height);

    public abstract void draw(Graphics g);
}
