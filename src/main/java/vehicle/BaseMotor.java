package vehicle;

public class BaseMotor extends BaseVehicle {
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
}
