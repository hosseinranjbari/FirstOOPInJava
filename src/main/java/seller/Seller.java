package seller;

import vehicle.BaseVehicle;

public class Seller {
    protected void sellVehicle() {
        BaseVehicle.increaseNumberOfSellingVehicles();
    }
}
