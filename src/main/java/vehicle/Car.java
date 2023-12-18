package vehicle;

public class Car extends Vehicle implements VehicleOptions{
    boolean isDoorOpen = false;

    String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public boolean isVehicleMoving() {
        return !isDoorOpen && isVehicleOn;
    }

    @Override
    public void openVehicleDoor() {
        isDoorOpen = true;
    }

    @Override
    public void closeVehicleDoor() {
        isDoorOpen = false;
    }
}