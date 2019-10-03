package GUITrafficSimulator2.Model;

import java.awt.*;

public abstract class Road {

    int length, lane1, lane2, connector;
    Color color = Color.gray;

    public Road(int lane1, int lane2, int connector) {
        this.lane1 = lane1;
        this.lane2 = lane2;
        this.connector = connector;
    }

    public int getRoadLength() {
        return length;
    }

    public void setRoadLength(int length) {
        if (length < 12) { // less than twice the size of a bus
            length = 12;
        } else {
            this.length = length;
        }
    }

    public int getLane1() {
        return lane1;
    }

    public void setLane1(int lane1) {
        this.lane1 = lane1;
    }

    public int getLane2() {
        return lane2;
    }

    public void setLane2(int lane2) {
        this.lane2 = lane2;
    }

    public int getConnector() {
        return connector;
    }

    public void setConnector(int connector) {
        this.connector = connector;
    }


    public abstract void canTurn();

    public abstract void turnDecision();

    public abstract void draw(Graphics g);
}
