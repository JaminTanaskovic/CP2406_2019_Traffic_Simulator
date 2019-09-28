package GUITrafficSimulator.Controller;

import GUITrafficSimulator.View.MainFrame;

public class Controller {
    public static void main(String[] args) {

        MainFrame mainFrame = new MainFrame();

        mainFrame.setNewCityMenuListener(e -> {

        });

        mainFrame.setEditCityMenuListener(e -> {

        });

        mainFrame.setOpenCityMenuListener(e -> {

        });

        mainFrame.setSaveCityMenuListener(e -> {

        });

        mainFrame.setUpdateRateMenuListener(e -> {

        });

        mainFrame.setVehicleRateMenuListener(e -> {

        });

        mainFrame.setRunSimMenuListener(e -> {

        });

        mainFrame.setStopSimMenuListener(e -> {
            System.exit(0);
        });
    }
}
