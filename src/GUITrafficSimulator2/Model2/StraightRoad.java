package GUITrafficSimulator2.Model2;

import java.awt.*;

public class StraightRoad extends Road2 {

    private final int minRoadLength = 12;
    private final int maxRoadLength = 30;
    int width, height;


    public StraightRoad(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
