import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.BaseVehicle;
import vehicle.PrintNameOfVehicles;
import vehicle.SedanCar;
import vehicle.TouringMotor;

public class PrintNameOfVehiclesTest {

    @Test
    void should_print_name_of_vehicles() {
        BaseVehicle pride = new SedanCar("pride");
        BaseVehicle bmw = new TouringMotor("bmw", 220);
        BaseVehicle[] listOfVehicles = {pride, bmw};

        PrintNameOfVehicles printNameOfVehicles = new PrintNameOfVehicles(listOfVehicles);

        String nameOfVehicles = printNameOfVehicles.execute();

        Assertions.assertEquals("pride-bmw", nameOfVehicles);


    }
}
