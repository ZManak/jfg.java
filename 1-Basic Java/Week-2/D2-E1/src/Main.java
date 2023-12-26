import vehicles.Models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, "ABC123", "Ford", "Focus", 2015, 1000000, 100, 100);
        Truck truck = new Truck(2, "DEF456", "Ford", "F-150", 2010, 2000000, 100, 100);
        Motorcycle motorcycle = new Motorcycle(3, "GHI789", "Yamaha", "FZ", 2018, 500000, 100, 100);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(motorcycle);

        for (Vehicle vehicle : vehicles) {
            System.out.println("ID: " + vehicle.getId());
            System.out.println("Plate: " + vehicle.getPlate());
            System.out.println("Brand: " + vehicle.getBrand());
            System.out.println("Model: " + vehicle.getModel());
            System.out.println("Year: " + vehicle.getYear());
            System.out.println("Cost: " + vehicle.getCost());
            vehicle.getAntiquity();
            if (vehicle instanceof Electric) {
                ((Electric) vehicle).chargeEnergy();
            } else if (vehicle instanceof Combustion) {
                ((Combustion) vehicle).refuel();
            }
            System.out.println();
        }
    }
}
