package GUITrafficSimulator2.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    //creating the frame and panel
    private JFrame frame = new JFrame("GUI Traffic Simulator");
    private JPanel mainPanel = new JPanel(new BorderLayout());

    //Creating the MenuBar and adding components
    private JMenuBar menuBar = new JMenuBar();

    private JMenu m1 = new JMenu("City Editing");
    private JMenu m2 = new JMenu("Simulation");

    //creating sub menu choices
    private JMenuItem newCity = new JMenuItem("New City");
    private JMenuItem editCity = new JMenuItem("Edit a City");
    private JMenuItem openCity = new JMenuItem("Open a City");
    private JMenuItem saveCity = new JMenuItem("Save a City");

    private JMenuItem updateRate = new JMenuItem("Set Update Rate");
    private JMenuItem vehicleRate = new JMenuItem("Set Vehicle Spawn Rate");
    private JMenuItem runSim = new JMenuItem("Run The Simulator");
    private JMenuItem stopSim = new JMenuItem("Stop The Simulator");

    //Creating the panel at bottom and adding components
    private JPanel bottomPanel = new JPanel();

    private JLabel modeLabel = new JLabel("Mode", SwingConstants.RIGHT);
    private JTextField modeLabelStats = new JTextField("Mode stats");

    private JLabel statusLabel = new JLabel("Status", SwingConstants.RIGHT);
    private JTextField statusLabelStats = new JTextField("Status stats");

    public MainFrame() {

        menuBar.add(m1);
        menuBar.add(m2);

        //add items for menu 1
        m1.add(newCity);
        m1.add(editCity);
        m1.add(openCity);
        m1.add(saveCity);

        //add items for menu 2
        m2.add(updateRate);
        m2.add(vehicleRate);
        m2.add(runSim);
        m2.add(stopSim);

        //add bottom panel
        bottomPanel.setLayout(new GridLayout(1, 4));

        bottomPanel.add(modeLabel);
        bottomPanel.add(modeLabelStats);
        bottomPanel.add(statusLabel);
        bottomPanel.add(statusLabelStats);

        //set text fields as non focusable so they can be used as display only
        modeLabelStats.setFocusable(false);
        statusLabelStats.setFocusable(false);

        bottomPanel.setBackground(Color.cyan);
        mainPanel.setBackground(Color.gray);
        menuBar.setBackground(Color.cyan);

        //Adding Components to the frame.
        frame.add(bottomPanel, BorderLayout.PAGE_END);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(menuBar, BorderLayout.PAGE_START);

        //adding action listeners to be handled in controller
        stopSim.addActionListener(this);
        runSim.addActionListener(this);
        vehicleRate.addActionListener(this);
        updateRate.addActionListener(this);
        newCity.addActionListener(this);
        openCity.addActionListener(this);
        editCity.addActionListener(this);
        saveCity.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void setNewCityMenuListener(ActionListener listener) {
        newCity.addActionListener(listener);
    }

    public void setEditCityMenuListener(ActionListener listener) {
        editCity.addActionListener(listener);
    }

    public void setOpenCityMenuListener(ActionListener listener) {
        openCity.addActionListener(listener);
    }

    public void setSaveCityMenuListener(ActionListener listener) {
        saveCity.addActionListener(listener);
    }

    public void setUpdateRateMenuListener(ActionListener listener) {
        updateRate.addActionListener(listener);
    }

    public void setVehicleRateMenuListener(ActionListener listener) {
        vehicleRate.addActionListener(listener);
    }

    public void setRunSimMenuListener(ActionListener listener) {
        runSim.addActionListener(listener);
    }

    public void setStopSimMenuListener(ActionListener listener) {
        stopSim.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

