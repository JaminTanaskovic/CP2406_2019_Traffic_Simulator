package GUITrafficSimulator2.Model2;

import java.awt.*;

public abstract class Road2 {

    int x, y, laneLeft, laneRight;
    Color color;

    public Road2(int x, int y) {
        assert x > 0 : "invalid x value, must be zero or more";
        this.x = x;
        this.y = y;
        this.color = Color.LIGHT_GRAY;
        this.laneLeft = getLaneLeft();
        this.laneRight = getLaneRight();
    }

    public Color getColor() {
        return color;
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

    public int getLaneLeft() {
        return laneLeft;
    }

    public void setLaneLeft(int laneLeft) {
        this.laneLeft = laneLeft;
    }

    public int getLaneRight() {
        return laneRight;
    }

    public void setLaneRight(int laneRight) {
        this.laneRight = laneRight;
    }

    public abstract void draw(Graphics g);

    @Override
    public String toString() {
        return String.format("%d %d", x, y);
    }
}
