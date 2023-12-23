import vehicle.car.SedanCar;
import vehicle.motor.TouringMotor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nameOfSedanCar = args[0];
        SedanCar camry = new SedanCar(nameOfSedanCar);
        System.out.println(camry.getInfo());

        String nameOfTouringMotor = args[1];
        int speedOfTouringMotor = Integer.parseInt(args[2]);
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
