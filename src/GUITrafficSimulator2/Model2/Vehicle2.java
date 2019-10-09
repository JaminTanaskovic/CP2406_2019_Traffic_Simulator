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
        return String.format("Shape: %d %d", x, y);
    }

    public void move() {
        x += speed * xDir;
        y += speed * yDir;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract boolean terminate(int width, int height);

    public abstract void draw(Graphics g);
}
