package vehicle;

public class TouringMotor extends BaseMotor {


    public TouringMotor(String nameOfMotor, double speedOfMotor) {
        super(nameOfMotor, speedOfMotor);
        System.out.println("This is a Touring Motor.");
        System.out.println("Name: " + nameOfMotor);
        System.out.println("speed: " + speedOfMotor);

    }

    @Override
    public String soundOfMotor() {
        return "vvvooo";
    }
}
