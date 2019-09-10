package ConsoleSimulator;

class Road {

    private int length;
    private int roadConnector;

    Road(int length, int roadConnector) {

        this.length = length;
        this.roadConnector = roadConnector;
    }

    int getLength() {
        return length;
    }

    void setLength(int length) {
        this.length = length;
    }

    int getRoadConnector() {
        return roadConnector;
    }

    void setRoadConnector(int roadConnector) {
        this.roadConnector = roadConnector;
    }
}
