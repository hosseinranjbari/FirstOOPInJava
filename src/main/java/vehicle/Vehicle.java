package vehicle;

public abstract class Vehicle {
    boolean isVehicleOn = false;

    public void turnOn() {
        isVehicleOn = true;
    }

    public void switchOff() {
        isVehicleOn = false;
    }

    public abstract boolean isVehicleMoving();
}
