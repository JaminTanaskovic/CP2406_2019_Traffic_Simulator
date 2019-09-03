package Console_Simulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrafficLightTest {

    TrafficLight trafficLight = new TrafficLight(1);

    @Test
    void getLightColour() {
        assertEquals(1, trafficLight.getLightColour());
        trafficLight.setLightColour(2);
        assertEquals(2, trafficLight.getLightColour());
    }
}