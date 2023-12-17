package vehicle;

public abstract class BaseCar extends BaseVehicle{
    boolean isDoorOpen = false;

    String carName;

    public BaseCar(String carName) {
        this.carName = carName;
    }

    public boolean isVehicleMoving() {
        return !isDoorOpen && isVehicleOn;
    }

    public void openVehicleDoor() {
        isDoorOpen = true;
    }

    public void closeVehicleDoor() {
        isDoorOpen = false;
    }

    public abstract String getInfo();
}
