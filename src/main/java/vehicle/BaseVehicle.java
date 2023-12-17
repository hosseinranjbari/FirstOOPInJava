package vehicle;

public abstract class BaseVehicle {
    boolean isVehicleOn = false;

    public void turnOn() {
        isVehicleOn = true;
    }

    public void switchOff() {
        isVehicleOn = false;
    }

    public abstract boolean isVehicleMoving();

    public abstract String getName();
}
