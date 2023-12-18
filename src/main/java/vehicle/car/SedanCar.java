package vehicle.car;

public class SedanCar extends BaseCar {
    public SedanCar(String nameOfSedan) {
        super(nameOfSedan);
        System.out.println("This is a Sedan car.");
        System.out.println("Name: " + nameOfSedan);

    }

    @Override
    public String getInfo() {
        return "this is a " + SedanCar.class.getName() + ". " + carName;
    }
}