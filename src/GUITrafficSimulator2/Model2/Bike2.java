package GUITrafficSimulator2.Model2;

import java.awt.*;

public class Bike2 extends Vehicle2 {
    private int width, height;

    public Bike2(int x, int y,
                 int xDir, int yDir, Color color,
                 int width, int height) {
        super(x, y, xDir, yDir, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean terminate(int boundaryWidth, int boundaryHeight) {
        if ((x < 0 && xDir < 0) || (x + width > boundaryWidth && xDir > 0)) {
            xDir *= -1;
            return true;
        }
        if ((y < 0 && yDir < 0) || (y + height > boundaryHeight && yDir > 0)) {
            yDir *= -1;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bike " + super.toString();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}


