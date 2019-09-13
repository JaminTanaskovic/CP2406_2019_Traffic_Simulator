package ConsoleSimulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrafficLightTest {

    private TrafficLight trafficLight = new TrafficLight(1, 3);

    @Test
    void TestTrafficLight() {
        assertEquals(1, trafficLight.getColour());
        trafficLight.setColour(2);
        assertEquals(2, trafficLight.getColour());
        assertEquals(3, trafficLight.getChangeCount());
        trafficLight.setChangeCount(4);
        assertEquals(4, trafficLight.getChangeCount());
    }
}