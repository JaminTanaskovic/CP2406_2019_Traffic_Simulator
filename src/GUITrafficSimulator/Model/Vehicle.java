package GUITrafficSimulator.Model;

import java.awt.*;

public abstract class Vehicle {
    int x, y;
    int xDir, yDir; // -1, 0, 1
    int speed;
    Color color;
    int size = 2;

    Vehicle(int x, int y, int xDir, int yDir, Color color, int size) {
        assert x > 0 : "invalid x value, must be zero or more";
        this.x = x;
        this.y = y;
        this.xDir = xDir;
        this.yDir = yDir;
        this.color = color;
        this.size = size;
      /*  if (color == null) {
            throw new ShapeException("color is null");
        }*/
    }

    @Override
    public String toString() {
        return String.format("Shape: %d %d", x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle other = (Vehicle) obj;
            return this.x == other.x && this.y == other.y;
        }
        return false;
    }

    public void move() {
        x += speed * xDir;
        y += speed * yDir;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void draw(Graphics g);
}
