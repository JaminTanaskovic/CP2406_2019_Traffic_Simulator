package GUITrafficSimulator.Model;

import java.awt.*;

public class Bike extends Vehicle {


    Bike(int x, int y, int xDir, int yDir, Color color, int size) {
        super(x, y, xDir, yDir, color, size / 2);
    }

    @Override
    public void draw(Graphics g) {

    }
}
