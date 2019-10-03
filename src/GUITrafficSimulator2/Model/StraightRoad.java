package GUITrafficSimulator2.Model;

import java.awt.*;

public class StraightRoad extends Road {

    private int length;
    private int roadConnector;

    public StraightRoad(int lane1, int lane2, int connector) {
        super(1, 2, 1);

        this.lane1 = lane1;
        this.lane2 = lane2;
        this.connector = connector;
    }

/*    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }*/

    @Override
    public void canTurn() {
        if (length == getRoadLength()) {

        }
    }

    @Override
    public void turnDecision() {

    }

    @Override
    public void draw(Graphics g) {

    }

    int getRoadConnector() {
        return roadConnector;
    }

    void setRoadConnector(int roadConnector) {
        this.roadConnector = roadConnector;
    }
}
