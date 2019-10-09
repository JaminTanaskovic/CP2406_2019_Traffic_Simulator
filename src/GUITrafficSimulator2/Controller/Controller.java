package GUITrafficSimulator2.Controller;

import GUITrafficSimulator2.Model2.*;
import GUITrafficSimulator2.View.MainFrame;
import GUITrafficSimulator2.View2.GamePane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Controller implements ActionListener {

    private final static Random random = new Random();

    Controller() {

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
        GamePane gamePane = new GamePane(WIDTH, HEIGHT, vehicles);
        mainFrame.add(gamePane, BorderLayout.CENTER);
        //   mainFrame.pack();
        mainFrame.setVisible(true);

        mainFrame.setNewCityMenuListener(e -> {
            System.out.println(e.getActionCommand());

            // create new game panel
        });

        mainFrame.setEditCityMenuListener(e -> {
            System.out.println(e.getActionCommand());
            //allow adding roads and traffic lights
            //rotate roads
            //save roads
        });

        mainFrame.setOpenCityMenuListener(e -> {
            System.out.println(e.getActionCommand());
            //open saved map
        });

        mainFrame.setSaveCityMenuListener(e -> {
            System.out.println(e.getActionCommand());
            //save map
        });

        mainFrame.setUpdateRateMenuListener(e -> {
            //set the rate changes are made on the screen
            String input = JOptionPane.showInputDialog("Enter The Time to Update Movement:");
            int spawnInput = Integer.parseInt(input);
            System.out.println(spawnInput);
        });

        mainFrame.setVehicleRateMenuListener(e -> {
            //set how many vehicles will spawn

            String input = JOptionPane.showInputDialog("Enter Amount of Vehicles to Spawn:");
            int vehicleInput = Integer.parseInt(input);
            System.out.println(vehicleInput);
        });

        mainFrame.setRunSimMenuListener(e -> {
            System.out.println(e.getActionCommand());
            //run sim
        });

        mainFrame.setStopSimMenuListener(e -> {
            System.out.println(e.getActionCommand());
            //   System.exit(0);
        });
    }

    public static void main(String[] args) {

        Controller controller = new Controller();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
