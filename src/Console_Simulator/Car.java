package Console_Simulator;

public class Car {

    private int position = 0;

    public Car(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void move(int position) {

        setPosition(getPosition() + 1);
        System.out.println("Moving down road");
        //       stopForLight();
    }

 /*   public void stopForLight(){

        if (Road.getRoadSegments() == position){
            if (TrafficLight.getLightColour() == 2){
                move(1);
            }else {
                System.out.println("Stopped at light");
            }
        }move(1);
    }*/
}
