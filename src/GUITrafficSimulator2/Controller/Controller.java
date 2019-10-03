package GUITrafficSimulator2.Controller;

import GUITrafficSimulator2.Model.Car;
import GUITrafficSimulator2.Model.StraightRoad;
import GUITrafficSimulator2.Model.TrafficLight;
import GUITrafficSimulator2.View.MainFrame;

import javax.swing.*;


public class Controller {
    public static void main(String[] args) {


        MainFrame mainFrame = new MainFrame();

        StraightRoad straightRoad1 = new StraightRoad(12, 1, 2);
        Car car = new Car(0, straightRoad1);
        GUITrafficSimulator2.Model.TrafficLight trafficLight = new TrafficLight(1, 2);

        // FourWayRoad fourWayRoad = new FourWayRoad(18, 1, 1, 1);

        mainFrame.setNewCityMenuListener(e -> {

            // create new game panel
        });

        mainFrame.setEditCityMenuListener(e -> {
            //allow adding roads and traffic lights
            //rotate roads
            //save roads
        });

        mainFrame.setOpenCityMenuListener(e -> {
            //open saved map
        });

        mainFrame.setSaveCityMenuListener(e -> {
            //save map
        });

        mainFrame.setUpdateRateMenuListener(e -> {
            //set the rate changes are made on the screen
            String input = JOptionPane.showInputDialog("Enter The Time to Update Movement:");
            int updateInput = Integer.parseInt(input);
            System.out.println(updateInput);
        });

        mainFrame.setVehicleRateMenuListener(e -> {
            //set how many vehicles will spawn

            String input = JOptionPane.showInputDialog("Enter Amount of Vehicles to Spawn:");
            int vehicleInput = Integer.parseInt(input);
            System.out.println(vehicleInput);
        });

        mainFrame.setRunSimMenuListener(e -> {
            //run sim
        });

        mainFrame.setStopSimMenuListener(e -> {
            System.exit(0);
        });
    }
}