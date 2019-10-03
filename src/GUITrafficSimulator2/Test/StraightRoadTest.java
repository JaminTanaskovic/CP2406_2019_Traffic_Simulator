package GUITrafficSimulator2.Test;

import GUITrafficSimulator2.Model.StraightRoad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StraightRoadTest {

    private StraightRoad road1 = new StraightRoad(1, 2, 1) {

        @Test
        void RoadTest() {
            assertEquals(12, road1.getRoadLength());
            road1.setRoadLength(7);
            assertEquals(7, road1.getRoadLength());
            assertEquals(2, road1.getConnector());
            road1.setConnector(3);
            assertEquals(3, road1.getConnector());
        }
    };
}
