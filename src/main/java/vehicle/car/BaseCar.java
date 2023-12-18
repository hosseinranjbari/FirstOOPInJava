package vehicle.car;

import vehicle.BaseVehicle;

public abstract class BaseCar extends BaseVehicle {
    protected boolean isDoorOpen = false;

    protected String carName;

    protected BaseCar(String carName) {
        this.carName = carName;
    }

    @Override

    public boolean isVehicleMoving() {
        return !isDoorOpen && isVehicleOn;
    }

    protected void openVehicleDoor() {
        isDoorOpen = true;
    }

    protected void closeVehicleDoor() {
        isDoorOpen = false;
    }

    public abstract String getInfo();

    public String getName() {
        return carName;
    }


    protected void turnOn() {
        isVehicleOn = true;
    }


    protected void switchOff() {
        isVehicleOn = false;
    }
}
