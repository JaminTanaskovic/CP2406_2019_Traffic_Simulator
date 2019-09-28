package GUITrafficSimulator.Model;

import java.awt.*;

public abstract class Road {
    int length, lane1, lane2, connector;
    Color color = Color.gray;

    public void rotate() {
        //tilt 90 degrees
/*        AffineTransform xform = new AffineTransform();
        xform.translate(0.5*h, 0.5*w);
        xform.rotate(theta);
        xform.translate(-0.5*w, -0.5*h);*/
    }

    public abstract boolean canTurn();

    public abstract void turnDecision();
}
