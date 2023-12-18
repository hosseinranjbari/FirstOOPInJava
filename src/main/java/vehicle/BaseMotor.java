package vehicle;

public abstract class BaseMotor extends BaseVehicle {
    protected String nameOfMotor;
    protected double speedOfMotor;
    protected BaseMotor(String nameOfMotor, double speedOfMotor) {
        this.nameOfMotor = nameOfMotor;
        this.speedOfMotor = speedOfMotor;
    }
    @Override
    protected boolean isVehicleMoving() {
        return isVehicleOn;
    }

    protected abstract String soundOfMotor();

    protected String getName() {
        return nameOfMotor;
    }
}
