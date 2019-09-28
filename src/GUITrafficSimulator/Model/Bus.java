package GUITrafficSimulator.Model;

import java.awt.*;

public class Bus extends Vehicle {

    Bus(int x, int y, int xDir, int yDir, Color color, int size) {
        super(x, y, xDir, yDir, color, size * 3);
    }

    @Override
    public void draw(Graphics g) {

    }
}
