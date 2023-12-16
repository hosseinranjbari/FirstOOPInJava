import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    void should_pride_moves_when_doors_are_close_and_car_is_on() {
        Car pride = new Car("pride");
        pride.closeDoor();
        pride.turnOn();

        boolean isPrideMoving = pride.isCarMoving();

        assertTrue(isPrideMoving);
    }

    @Test
    void should_pride_parks_when_doors_are_close_and_car_is_switch_off() {
        Car pride = new Car("pride");
        pride.closeDoor();
        pride.switchOff();

        boolean isPrideMoving = pride.isCarMoving();

        assertFalse(isPrideMoving);

    }

    @Test
    void should_pride_parks_when_doors_are_open_and_car_is_on() {
        Car pride = new Car("pride");
        pride.openDoor();
        pride.turnOn();

        boolean isPrideMoving = pride.isCarMoving();

        assertFalse(isPrideMoving);
    }

    @Test
    void should_pride_parks_when_doors_are_open_and_car_is_switch_off() {
        Car pride = new Car("pride");
        pride.openDoor();
        pride.switchOff();

        boolean isPrideMoving = pride.isCarMoving();

        assertFalse(isPrideMoving);
    }

    class Car {
        boolean isDoorOpen = false;
        boolean isCarOn = false;

        String carName;

        public Car(String carName) {
            this.carName = carName;
        }

        void openDoor() {
            isDoorOpen = true;
            System.out.println("Door is open.");
        }

        void closeDoor() {
            isDoorOpen = false;
            System.out.println("Door is close.");
        }

        void turnOn() {
            isCarOn = true;
            System.out.println("Car is started!");
        }

        void switchOff() {
            isCarOn = false;
            System.out.println("Car is switched off");
        }

        boolean isCarMoving() {
            if (!isDoorOpen && isCarOn) {
                System.out.println("Car is moving...");
                return true;
            } else {
                System.out.println("Car is park.\n" +
                        "You should close Doors and Turn on and then you can move");
                return false;
            }
        }
    }
}
