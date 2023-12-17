import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.BaseMotor;
import vehicle.TouringMotor;
import vehicle.BaseVehicle;

public class TouringMotorTest {
    @Test
    void motor_should_move_when_it_is_on() {
        BaseMotor motor = new TouringMotor("BMW K 1200 LT ", 220);
        motor.turnOn();
        System.out.println(motor.soundOfMotor());

        boolean vehicleMoving = motor.isVehicleMoving();

        Assertions.assertTrue(vehicleMoving);

        System.out.println("************************");
    }

    @Test
    void motor_should_be_in_park_when_it_is_switched_off() {
        BaseVehicle motor = new TouringMotor("Harley-Davidson", 235);
        motor.switchOff();

        boolean vehicleMoving = motor.isVehicleMoving();

        Assertions.assertFalse(vehicleMoving);

        System.out.println("************************");
    }
}
