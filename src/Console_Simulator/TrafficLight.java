package Console_Simulator;

public class TrafficLight {

    private int lightColour;  // 1 = red, 2 = green, 3 = orange

    public TrafficLight(int lightColour) {
        this.lightColour = lightColour;
    }

    public int getLightColour() {
        return lightColour;
    }

    public void setLightColour(int lightColour) {
        this.lightColour = lightColour;
    }

    public void checkLight(int lightColour) {

        switch (lightColour) {  // most of this repeated code should be made a function

            case 1:
                int countRed = 2;
                for (int i = 0; i < countRed; i++) {
                    System.out.println("The light is Red");
                }
                setLightColour(2);
                break;

            case 2:
                int countGreen = 8;
                for (int i = 0; i < countGreen; i++) {
                    System.out.println("The light is Green");
                }
                setLightColour(3);
                break;

            case 3:
                int countOrange = 2;
                for (int i = 0; i < countOrange; i++) {
                    System.out.println("The light is Orange");
                }
                setLightColour(1);
                break;
        }
    }
}


