package ConsoleSimulator;

class MotorBike extends Car {

    int mLength = super.getLength() / 2;

    MotorBike(int position, Road road) {
        super(position, road);
    }
}
