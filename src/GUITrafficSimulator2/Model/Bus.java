package GUITrafficSimulator2.Model;

class Bus extends Car {

    int bLength = super.getLength() * 3;

    Bus(int position, Road road) {
        super(position, road);
    }
}
