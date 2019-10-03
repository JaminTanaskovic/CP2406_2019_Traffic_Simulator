package GUITrafficSimulator2.Model;

class MotorBike extends Car {

    int mLength = super.getLength() / 2;

    MotorBike(int position, StraightRoad straightRoad) {
        super(position, straightRoad);
    }
}
