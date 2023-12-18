package vehicle;

public abstract class BaseCar extends BaseVehicle{
    protected boolean isDoorOpen = false;

    protected String carName;

    protected BaseCar(String carName) {
        this.carName = carName;
    }

    protected boolean isVehicleMoving() {
        return !isDoorOpen && isVehicleOn;
    }

    protected void openVehicleDoor() {
        isDoorOpen = true;
    }

    protected void closeVehicleDoor() {
        isDoorOpen = false;
    }

    protected abstract String getInfo();

    protected String getName() {
        return carName;
    }
}
