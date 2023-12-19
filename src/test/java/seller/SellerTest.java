package seller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.BaseVehicle;

public class SellerTest {
    @Test
    void should_count_number_of_selling_vehicles() {
        Seller seller1 = new Seller();
        seller1.sellVehicle();
        seller1.sellVehicle();
        seller1.sellVehicle();

        Seller seller2 = new Seller();
        seller2.sellVehicle();
        seller2.sellVehicle();

        Assertions.assertEquals(5, BaseVehicle.getNumberOfSellingVehicles());
    }
}
