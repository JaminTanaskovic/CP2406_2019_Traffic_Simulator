package Console_Simulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoadTest {

    Road road = new Road(6, true);

    @Test
    void RoadTest() {
        assertEquals(6, road.getRoadSegments());
        road.setRoadSegments(8);
        assertEquals(8, road.getRoadSegments());
        assertEquals(true, road.isHasTrafficLight());
        road.setHasTrafficLight(false);
        assertEquals(false, road.isHasTrafficLight());
    }
}