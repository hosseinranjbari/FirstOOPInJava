package vehicle;

public abstract class BaseVehicle {
    private static int numberOfSellingVehicles;
    protected boolean isVehicleOn = false;

    public static int getNumberOfSellingVehicles() {
        return numberOfSellingVehicles;
    }

    public static void increaseNumberOfSellingVehicles() {
        numberOfSellingVehicles++;
    }

    protected abstract void turnOn();

    protected abstract void switchOff();

    public abstract boolean isVehicleMoving();

    public abstract String getName();
}
