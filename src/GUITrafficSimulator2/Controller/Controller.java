package GUITrafficSimulator2.Controller;

import GUITrafficSimulator2.Model2.*;
import GUITrafficSimulator2.View.MainFrame;
import GUITrafficSimulator2.View2.GamePane;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Controller {

    private final static Random random = new Random();
    private int vehicleSpawn = 10;

    Controller() {

        final int WIDTH = 500;
        final int HEIGHT = 500;
        int speed = 2;

        Vehicle2[] vehicles = new Vehicle2[vehicleSpawn];
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

        GamePane gamePane = new GamePane(WIDTH, HEIGHT, vehicles);
        MainFrame mainFrame = new MainFrame(gamePane);

        // Create a new game panel
        mainFrame.setNewCityMenuListener(e -> {

            gamePane.setupNewGame();
            System.out.println(e.getActionCommand());
        });

        // Add to new game panel ( setup city )
        mainFrame.setEditCityMenuListener(e -> {

            mainFrame.turnOnEditPanel();
            System.out.println(e.getActionCommand());
        });

        // Open saved city
        mainFrame.setOpenCityMenuListener(e -> {
            System.out.println(e.getActionCommand());
            //open saved map
        });

        // Saves the created city
        mainFrame.setSaveCityMenuListener(e -> {
            System.out.println(e.getActionCommand());
            //save map
        });

        // Set the rate changes are made on the screen
        mainFrame.setUpdateRateMenuListener(e -> {

            String input = JOptionPane.showInputDialog("Enter The Time to Update Movement:");
            int updateInput = Integer.parseInt(input);
            gamePane.setTimerDelay(updateInput);  // set updateInput to change the timer delay value
            System.out.println(gamePane.getTimerDelay());
        });
        // Set how many vehicles will spawn
        mainFrame.setVehicleRateMenuListener(e -> {

            String input = JOptionPane.showInputDialog("Enter Amount of Vehicles to Spawn:");
            int vehicleInput = Integer.parseInt(input);
            setVehicleSpawn(vehicleInput);
            System.out.println(getVehicleSpawn());
        });

        // Start the Simulation
        mainFrame.setRunSimMenuListener(e -> {

            gamePane.timerStart();
            System.out.println(e.getActionCommand());
        });

        // Stop the Simulation
        mainFrame.setStopSimMenuListener(e -> {

            gamePane.timerStop();
            System.out.println(e.getActionCommand());
        });

        // Add straight road to game panel
        mainFrame.straightRoadListener(e -> {

            int roadLengthInput = Integer.parseInt(JOptionPane.showInputDialog("Enter the road length ( min = 6, max = 30"));
            //          int roadLengthInput = Integer.parseInt(input);
            StraightRoad.setWidth(roadLengthInput);
            System.out.println(e.getActionCommand());
        });

        // Add TJunction road to game panel
        mainFrame.tJunctionListener(e -> {

            System.out.println(e.getActionCommand());
        });

        // Add Four Way road to game panel
        mainFrame.fourWayListener(e -> {

            System.out.println(e.getActionCommand());
        });

        // Close the edit panel
        mainFrame.cancelListener(e -> {

            mainFrame.turnOffEditPanel();
            System.out.println(e.getActionCommand());
        });
    }

    public int getVehicleSpawn() {

        return vehicleSpawn;
    }

    public void setVehicleSpawn(int vehicleSpawn) {

        this.vehicleSpawn = vehicleSpawn;
    }

    public static void main(String[] args) {

        Controller controller = new Controller();
    }
}
