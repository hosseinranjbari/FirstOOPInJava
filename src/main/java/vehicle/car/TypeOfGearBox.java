package vehicle.car;

public enum TypeOfGearBox {
    MANUAL("دستی"),
    AUTOMATIC("اتوماتیک");

    private final String toPersian;
    TypeOfGearBox(String toPersian) {
        this.toPersian = toPersian;
    }

    public static void print() {
        TypeOfGearBox[] gearBoxTypes = TypeOfGearBox.values();
        for (int index = 0; index < gearBoxTypes.length; index++) {
            System.out.println(gearBoxTypes[index]);
        }
    }

    public static void printPersian() {
        TypeOfGearBox[] gearBoxTypes = TypeOfGearBox.values();
        for (int index = 0; index < gearBoxTypes.length; index++) {
            System.out.println(gearBoxTypes[index].toPersian);
        }
    }

    public String getToPersian() {
        return toPersian;
    }
}
