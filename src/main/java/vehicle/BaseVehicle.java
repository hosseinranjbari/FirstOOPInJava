package vehicle;

public abstract class BaseVehicle {
    protected boolean isVehicleOn = false;

    protected abstract void turnOn();

    protected abstract void switchOff();

    public abstract boolean isVehicleMoving();

    public abstract String getName();
}
