package vehicle;

public class Motor extends Vehicle{

    public boolean isVehicleMoving() {
        if (isVehicleOn) {
            System.out.println("Motor is moving...");
            return true;
        } else {
            System.out.println("Motor is park.\n" +
                    "You should Turn on and then you can move");
            return false;
        }
    }
}
