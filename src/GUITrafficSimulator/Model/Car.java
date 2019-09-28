package GUITrafficSimulator.Model;

import java.awt.*;

public class Car extends Vehicle {

    private int size;
    private Color color;

    public Car(int x, int y, int xDir, int yDir) {
        super(x, y, xDir, yDir);
        this.size = 2;
        this.color = Color.blue;

    }


    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, 1, 2);
    }
}
