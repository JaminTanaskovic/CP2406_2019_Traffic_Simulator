package GUITrafficSimulator.Model;

public class FourWayRoad extends Road {
    Enum description = {STRAIGHT, TJUNCTION, FOURWAY;
}

    public FourWayRoad(int length, int lane1, int lane2, int connector) {
        super(length, lane1, lane2, connector);
    }

    @Override
    public boolean canTurn() {
        if ((length == this.length) && (this.description != STRAIGHT)) {
            
        }
        return false;
    }

    @Override
    public void turnDecision() {

    }
}
