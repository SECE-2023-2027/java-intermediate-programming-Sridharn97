import java.util.Scanner;

public class Main {
    private static Vehicle createVehicle(String choice) {
        if ("car".equalsIgnoreCase(choice)) {
            return new Car();
        }
        if ("motorcycle".equalsIgnoreCase(choice)) {
            return new Motorcycle();
        }
        return new Vehicle();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = createVehicle(scanner.nextLine().trim());

        vehicles[1] = createVehicle(scanner.nextLine().trim());

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.startEngine());
        }

        scanner.close();
    }
}
