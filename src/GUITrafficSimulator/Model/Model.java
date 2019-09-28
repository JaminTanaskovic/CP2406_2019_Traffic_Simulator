package GUITrafficSimulator.Model;

import javax.swing.*;
import java.awt.*;

public class Model {
    public static void main(String[] args) {

        JFrame frame = new JFrame("GUI Traffic Simulator");
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.green); //test where panel is

        //Creating the MenuBar and adding components
        JMenuBar menuBar = new JMenuBar();

        JMenu m1 = new JMenu("City Editing");
        JMenu m2 = new JMenu("Simulation");

        menuBar.add(m1);
        menuBar.add(m2);

        JMenuItem newCity = new JMenuItem("New City");
        JMenuItem editCity = new JMenuItem("Edit a City");
        JMenuItem openCity = new JMenuItem("Open a City");
        JMenuItem saveCity = new JMenuItem("Save a City");

        JMenuItem updateRate = new JMenuItem("Set Update Rate");
        JMenuItem vehicleRate = new JMenuItem("Set Vehicle Spawn Rate");
        JMenuItem runSim = new JMenuItem("Run The Simulator");
        JMenuItem stopSim = new JMenuItem("Stop The Simulator");

        m1.add(newCity);
        m1.add(editCity);
        m1.add(openCity);
        m1.add(saveCity);

        m2.add(updateRate);
        m2.add(vehicleRate);
        m2.add(runSim);
        m2.add(stopSim);

        //Creating the panel at bottom and adding components
        JPanel bottomPanel = new JPanel(); // the panel is not visible in output
        bottomPanel.setBackground(Color.blue);//test where panel is

        JLabel modeLabel = new JLabel("Mode");
        JLabel modeLabelStats = new JLabel("Mode stats");
        JLabel statusLabel = new JLabel("Status");
        JLabel statusLabelStats = new JLabel("Status stats");

        bottomPanel.add(modeLabel); // Components Added using Flow Layout
        bottomPanel.add(modeLabelStats);
        bottomPanel.add(statusLabel); // Components Added using Flow Layout
        bottomPanel.add(statusLabelStats);

        //Adding Components to the frame.
        frame.add(bottomPanel, BorderLayout.PAGE_END);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(menuBar, BorderLayout.PAGE_START);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
