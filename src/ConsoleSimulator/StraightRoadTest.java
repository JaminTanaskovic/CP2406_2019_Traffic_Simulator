package ConsoleSimulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StraightRoadTest {

    private Road road1 = new Road(5, 2);

    @Test
    void RoadTest() {
        assertEquals(5, road1.getLength());
        road1.setLength(7);
        assertEquals(7, road1.getLength());
        assertEquals(2, road1.getRoadConnector());
        road1.setRoadConnector(3);
        assertEquals(3, road1.getRoadConnector());


    }
}