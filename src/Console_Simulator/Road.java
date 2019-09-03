package Console_Simulator;

public class Road {

    private int roadSegments;
    private boolean hasTrafficLight;

    public Road(int roadSegments, boolean hasTrafficLight) {

        this.roadSegments = roadSegments;
        this.hasTrafficLight = hasTrafficLight;
    }

    public int getRoadSegments() {
        return roadSegments;
    }

    public void setRoadSegments(int roadSegments) {
        this.roadSegments = roadSegments;
    }

    public boolean isHasTrafficLight() {
        return hasTrafficLight;
    }

    public void setHasTrafficLight(boolean hasTrafficLight) {
        this.hasTrafficLight = hasTrafficLight;
    }
}
