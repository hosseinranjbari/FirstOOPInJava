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
        System.out.println("Door is open.");
    }

    @Override
    public void closeVehicleDoor() {
        isDoorOpen = false;
        System.out.println("Door is close.");
    }
}