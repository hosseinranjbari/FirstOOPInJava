package vehicle;

import vehicle.BaseCar;
import vehicle.SedanCar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SedanCarTest {
    @Test
    void should_pride_moves_when_doors_are_close_and_car_is_on() {
        BaseCar pride = new SedanCar("pride");
        pride.closeVehicleDoor();
        pride.turnOn();

        boolean isPrideMoving = pride.isVehicleMoving();

        assertTrue(isPrideMoving);

        pride.getInfo();
        System.out.println("************************");
    }

    @Test
    void should_pride_parks_when_doors_are_close_and_car_is_switch_off() {
        BaseCar pride = new SedanCar("pride");
        pride.closeVehicleDoor();
        pride.switchOff();

        boolean isPrideMoving = pride.isVehicleMoving();

        assertFalse(isPrideMoving);

        pride.getInfo();
        System.out.println("************************");

    }

    @Test
    void should_pride_parks_when_doors_are_open_and_car_is_on() {
        BaseCar pride = new SedanCar("pride");
        pride.openVehicleDoor();
        pride.turnOn();

        boolean isPrideMoving = pride.isVehicleMoving();

        assertFalse(isPrideMoving);

        pride.getInfo();
        System.out.println("************************");
    }

    @Test
    void should_pride_parks_when_doors_are_open_and_car_is_switch_off() {
        BaseCar pride = new SedanCar("pride");
        pride.openVehicleDoor();
        pride.switchOff();

        boolean isPrideMoving = pride.isVehicleMoving();

        assertFalse(isPrideMoving);

        pride.getInfo();
        System.out.println("************************");
    }

}
