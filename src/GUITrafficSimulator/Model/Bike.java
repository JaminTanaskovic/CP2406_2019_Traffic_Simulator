package GUITrafficSimulator.Model;

import java.awt.*;

public class Bike extends Vehicle {

    private int size;
    private Color color;

    public Bike(int x, int y, int xDir, int yDir) {
        super(x, y, xDir, yDir);
        this.size = size / 2;
        this.color = Color.green;
    }

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, 1, 1);
    }
}
