package GUITrafficSimulator2.View2;

import GUITrafficSimulator2.Model2.Vehicle2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GamePane extends JPanel implements ActionListener {
    private final static Random random = new Random();
    private Vehicle2[] vehicles;

    public GamePane(int width, int height, Vehicle2[] vehicles) {
        setBackground(Color.BLACK);
        this.vehicles = vehicles;
        setPreferredSize(new Dimension(width, height));
        Timer timer = new Timer(30, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Vehicle2 vehicle2 : vehicles) {
            if (vehicle2.terminate(getWidth(), getHeight())) {
                vehicle2.setSpeed(random.nextInt(10) + 1);
            }
            vehicle2.move();
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Vehicle2 vehicle2 : vehicles) {
            vehicle2.draw(g);
        }
    }
}

