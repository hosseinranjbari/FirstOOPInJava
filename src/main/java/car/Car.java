package car;

public class Car {
    boolean isDoorOpen = false;
    boolean isCarOn = false;

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

    public void turnOn() {
        isCarOn = true;
        System.out.println("car.Car is started!");
    }

    public void switchOff() {
        isCarOn = false;
        System.out.println("car.Car is switched off");
    }

    public boolean isCarMoving() {
        if (!isDoorOpen && isCarOn) {
            System.out.println("car.Car is moving...");
            return true;
        } else {
            System.out.println("car.Car is park.\n" +
                    "You should close Doors and Turn on and then you can move");
            return false;
        }
    }
}