package vehicle.car;

import vehicle.BaseVehicle;

public abstract class BaseCar extends BaseVehicle {
    protected boolean isDoorOpen = false;
    protected TypeOfGearBox gearBoxType;

    protected String carName;

    protected BaseCar(String carName, TypeOfGearBox gearBoxType) {
        this.carName = carName;
        this.gearBoxType = gearBoxType;
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
