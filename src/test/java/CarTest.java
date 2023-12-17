import vehicle.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    void should_pride_moves_when_doors_are_close_and_car_is_on() {
        Car pride = new Car("pride");
        pride.closeDoor();
        pride.turnOn();

        boolean isPrideMoving = pride.isVehicleMoving();

        assertTrue(isPrideMoving);
    }

    @Test
    void should_pride_parks_when_doors_are_close_and_car_is_switch_off() {
        Car pride = new Car("pride");
        pride.closeDoor();
        pride.switchOff();

        boolean isPrideMoving = pride.isVehicleMoving();

        assertFalse(isPrideMoving);

    }

    @Test
    void should_pride_parks_when_doors_are_open_and_car_is_on() {
        Car pride = new Car("pride");
        pride.openDoor();
        pride.turnOn();

        boolean isPrideMoving = pride.isVehicleMoving();

        assertFalse(isPrideMoving);
    }

    @Test
    void should_pride_parks_when_doors_are_open_and_car_is_switch_off() {
        Car pride = new Car("pride");
        pride.openDoor();
        pride.switchOff();

        boolean isPrideMoving = pride.isVehicleMoving();

        assertFalse(isPrideMoving);
    }

}
