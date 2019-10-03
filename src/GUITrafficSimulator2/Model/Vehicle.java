package GUITrafficSimulator2.Model;

import java.awt.*;

public abstract class Vehicle {
    int x, y;
    int xDir, yDir; // -1, 0, 1
    int speed;

    Vehicle(int x, int y, int xDir, int yDir) {
        assert x > 0 : "invalid x value, must be zero or more";
        this.x = x;
        this.y = y;
        this.xDir = xDir;
        this.yDir = yDir;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GUITrafficSimulator2.Model.Vehicle) {
            GUITrafficSimulator2.Model.Vehicle other = (GUITrafficSimulator2.Model.Vehicle) obj;
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
