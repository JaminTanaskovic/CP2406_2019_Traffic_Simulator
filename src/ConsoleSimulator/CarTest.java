package ConsoleSimulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    private Car car = new Car(0, 1);

    @Test
    void TestCar() {
        assertEquals(0, car.getPosition());
        car.setPosition(1);
        assertEquals(1, car.getPosition());
        assertEquals(1, car.getRoad());
        car.setRoad(2);
        assertEquals(2, car.getRoad());

    }
}