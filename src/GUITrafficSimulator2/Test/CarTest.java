package GUITrafficSimulator2.Test;

import GUITrafficSimulator2.Model.Car;
import GUITrafficSimulator2.Model.StraightRoad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    private StraightRoad straightRoad1;
    private Car car = new Car(0, straightRoad1);
    private StraightRoad straightRoad2;

    @Test
    void TestCar() {
        assertEquals(0, car.getPosition());
        car.setPosition(1);
        assertEquals(1, car.getPosition());
        assertEquals(straightRoad1, car.getRoad());
        car.setRoad(straightRoad2);
        assertEquals(straightRoad2, car.getRoad());

    }
}