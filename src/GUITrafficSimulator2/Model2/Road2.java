package GUITrafficSimulator2.Model2;

import java.awt.*;

public abstract class Road2 {

    private int roadX, roadY, length;

    public Road2(int roadX, int roadY, int length) {
        this.roadX = roadX;
        this.roadY = roadY;
        this.length = length;
    }

    public int getRoadX() {
        return roadX;
    }

    public void setRoadX(int roadX) {
        this.roadX = roadX;
    }

    public int getRoadY() {
        return roadY;
    }

    public void setRoadY(int roadY) {
        this.roadY = roadY;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public abstract void draw(Graphics g);

    @Override
    public String toString() {
        return String.format("%d %d %d", roadX, roadY, length);
    }
}
