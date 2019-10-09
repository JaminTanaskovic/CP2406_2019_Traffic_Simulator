package GUITrafficSimulator2.Model2;

import java.awt.*;

public class Bus2 extends Vehicle2 {
    private int width, height;

    public Bus2(int x, int y,
                int xDir, int yDir, Color color,
                int width, int height) {
        super(x, y, xDir, yDir, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean terminate(int boundaryWidth, int boundaryHeight) {
        if ((x < 0 && xDir < 0) || (x + width > boundaryWidth && xDir > 0)) {
            xDir += 10;
            return true;
        }
        if ((y < 0 && yDir < 0) || (y + height > boundaryHeight && yDir > 0)) {
            yDir += 10;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bus " + super.toString();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
