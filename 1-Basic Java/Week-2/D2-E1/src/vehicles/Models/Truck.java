package vehicles.Models;

public class Truck extends Vehicle implements Combustion {
    private int fuelCapacity;
    private int fuelConsumption;

    public Truck(int id, String plate, String brand, String model, int year, double cost, int fuelCapacity, int fuelConsumption) {
        super(id, plate, brand, model, year, cost);
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling...");
    }

    @Override
    public void getAntiquity() {
        System.out.println("The truck is " + (2024 - getYear()) + " years old.");
    }
}
