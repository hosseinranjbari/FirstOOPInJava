import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.Motor;
import vehicle.Vehicle;

public class MotorTest {
    @Test
    void motor_should_move_when_it_is_on() {
        Vehicle motor = new Motor();
        motor.turnOn();

        boolean vehicleMoving = motor.isVehicleMoving();

        Assertions.assertTrue(vehicleMoving);
    }

    @Test
    void motor_should_be_in_park_when_it_is_switched_off() {
        Vehicle motor = new Motor();
        motor.switchOff();

        boolean vehicleMoving = motor.isVehicleMoving();

        Assertions.assertFalse(vehicleMoving);
    }
}
