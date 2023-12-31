import vehicle.car.SedanCar;
import vehicle.car.TypeOfGearBox;
import vehicle.motor.TouringMotor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nameOfSedanCar = args[0];
        TypeOfGearBox gearBoxType = TypeOfGearBox.valueOf(args[1]);
        SedanCar camry = new SedanCar(nameOfSedanCar, gearBoxType);
        System.out.println(camry.getInfo());

        String nameOfTouringMotor = args[2];
        int speedOfTouringMotor = Integer.parseInt(args[3]);
        TouringMotor kawasaki = new TouringMotor(nameOfTouringMotor, speedOfTouringMotor);
        System.out.println(kawasaki.getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Dear User.");

        System.out.println("What's you're name? ");
        String userName = scanner.nextLine();

        System.out.println("How old are you? ");
        String age = scanner.nextLine();

        System.out.println("Welcome dear " + userName + ". You're age is " + age);
        System.out.println("Are you confirm these information? ");

    }
}
