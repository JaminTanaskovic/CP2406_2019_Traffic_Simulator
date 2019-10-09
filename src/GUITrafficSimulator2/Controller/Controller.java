package GUITrafficSimulator2.Controller;

import GUITrafficSimulator2.Model.Car;
import GUITrafficSimulator2.Model.StraightRoad;
import GUITrafficSimulator2.Model.TrafficLight;
import GUITrafficSimulator2.View.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener {
    Controller() {

        MainFrame mainFrame = new MainFrame();
        Timer timer = new Timer(1000 / 24, this);

        StraightRoad straightRoad1 = new StraightRoad(12, 1, 2);
        Car car = new Car(0, straightRoad1);
        GUITrafficSimulator2.Model.TrafficLight trafficLight = new TrafficLight(1, 2);

        // FourWayRoad fourWayRoad = new FourWayRoad(18, 1, 1, 1);

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
        //       MainFrame mainFrame = new MainFrame();
        //       mainFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
