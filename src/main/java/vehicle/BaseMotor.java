package vehicle;

public abstract class BaseMotor extends BaseVehicle {
    String nameOfMotor;
    double speedOfMotor;
    public BaseMotor(String nameOfMotor, double speedOfMotor) {
        this.nameOfMotor = nameOfMotor;
        this.speedOfMotor = speedOfMotor;
    }
    @Override
    public boolean isVehicleMoving() {
        return isVehicleOn;
    }

    public abstract String soundOfMotor();
}
