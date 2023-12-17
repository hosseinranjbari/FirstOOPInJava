package vehicle;

public class PrintNameOfVehicles {
    BaseVehicle[] listOfVehicles;

    public PrintNameOfVehicles(BaseVehicle[] listOfVehicles) {
        this.listOfVehicles = listOfVehicles;
    }

    public String execute() {
        StringBuilder nameOfVehicles = new StringBuilder();
        for (int index = 0; index < listOfVehicles.length; index++) {
            if (index != listOfVehicles.length - 1) {
                nameOfVehicles.append(listOfVehicles[index].getName()).append("-");
            } else {
                nameOfVehicles.append(listOfVehicles[index].getName());
            }

        }

        return nameOfVehicles.toString();
    }
}