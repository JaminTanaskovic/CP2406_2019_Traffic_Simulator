package GUITrafficSimulator2.Controller2;

import GUITrafficSimulator2.Model2.*;
import GUITrafficSimulator2.View.MainFrame;

import java.awt.*;
import java.util.Random;

public class Controller2 {
    private final static Random random = new Random();

    public static void main(String[] args) {
        final int WIDTH = 500;
        final int HEIGHT = 500;
        int speed = 2;

        Vehicle2[] vehicles = new Vehicle2[50];
        for (int i = 0; i < vehicles.length; ++i) {
            int x = random.nextInt();
            int y = random.nextInt();
            int xDir = random.nextBoolean() ? -1 : 1;
            int yDir = random.nextBoolean() ? -1 : 1;

            switch (VehicleType.random()) {
                case CAR:
                    Color color1 = Color.red;
                    vehicles[i] = new Car2(x, y, xDir, yDir, color1, 2, 1);
                    break;
                case BIKE:
                    Color color2 = Color.yellow;
                    vehicles[i] = new Bike2(x, y, xDir, yDir, color2, 1, 1);
                    break;
                case BUS:
                    Color color3 = Color.green;
                    vehicles[i] = new Bus2(x, y, xDir, yDir, color3, 6, 1);
                    break;
            }

            vehicles[i].setSpeed(speed);
            System.out.println(vehicles[i]);
        }

        MainFrame mainFrame = new MainFrame();
/*        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePane gamePane = new GamePane(WIDTH, HEIGHT, vehicles);
        mainFrame.add(gamePane, BorderLayout.CENTER);

        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        */
    }
}

