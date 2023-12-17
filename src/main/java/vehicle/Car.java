package vehicle;

public class Car extends Vehicle{
    boolean isDoorOpen = false;

    String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public void openDoor() {
        isDoorOpen = true;
        System.out.println("Door is open.");
    }

    public void closeDoor() {
        isDoorOpen = false;
        System.out.println("Door is close.");
    }

    public boolean isVehicleMoving() {
        if (!isDoorOpen && isVehicleOn) {
            System.out.println("car.Car is moving...");
            return true;
        } else {
            System.out.println("car.Car is park.\n" +
                    "You should close Doors and Turn on and then you can move");
            return false;
        }
    }
}