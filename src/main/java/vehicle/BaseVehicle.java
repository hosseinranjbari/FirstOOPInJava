package vehicle;

public abstract class BaseVehicle {
    protected boolean isVehicleOn = false;

    protected void turnOn() {
        isVehicleOn = true;
    }

    protected void switchOff() {
        isVehicleOn = false;
    }

    protected abstract boolean isVehicleMoving();

    protected abstract String getName();
}
