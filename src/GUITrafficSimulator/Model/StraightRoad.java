package GUITrafficSimulator.Model;

import java.awt.*;

public class StraightRoad extends Road {

    public StraightRoad(int length, int lane1, int lane2, int connector) {
        super(length, lane1, lane2, connector);
    }

    @Override
    public void canTurn() {

    }

    @Override
    public TurnDirection turnDecision() {
        return null;
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(Color.gray);
        g.drawRect(0, 0, 12, 2);
        g.fillRect(0, 0, 12, 2);

    }
}
