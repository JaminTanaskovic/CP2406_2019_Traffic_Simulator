package GUITrafficSimulator.Model;

public class TJunctionRoad extends Road {

    public TJunctionRoad(int length, int lane1, int lane2, int connector) {
        super(length, lane1, lane2, connector);
    }

    @Override
    public boolean canTurn() {
        return false;
    }

    @Override
    public void turnDecision() {

    }
}
