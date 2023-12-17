package vehicle;

public class Vehicle {
    boolean isVehicleOn = false;

    public void turnOn() {
        isVehicleOn = true;
    }

    public void switchOff() {
        isVehicleOn = false;
    }
}
