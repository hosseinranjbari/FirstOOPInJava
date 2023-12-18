package vehicle.motor;

import vehicle.BaseVehicle;

public abstract class BaseMotor extends BaseVehicle {
    protected String nameOfMotor;
    protected double speedOfMotor;
    protected BaseMotor(String nameOfMotor, double speedOfMotor) {
        this.nameOfMotor = nameOfMotor;
        this.speedOfMotor = speedOfMotor;
    }
    @Override
    public boolean isVehicleMoving() {
        return isVehicleOn;
    }

    public abstract String soundOfMotor();

    public String getName() {
        return nameOfMotor;
    }

    protected void turnOn() {
        isVehicleOn = true;
    }

    protected void switchOff() {
        isVehicleOn = false;
    }

}
