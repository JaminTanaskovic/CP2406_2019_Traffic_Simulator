package ConsoleSimulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    private Road road1;
    private Car car = new Car(0, road1);
    private Road road2;

    @Test
    void TestCar() {
        assertEquals(0, car.getPosition());
        car.setPosition(1);
        assertEquals(1, car.getPosition());
        assertEquals(road1, car.getRoad());
        car.setRoad(road2);
        assertEquals(road2, car.getRoad());

    }
}