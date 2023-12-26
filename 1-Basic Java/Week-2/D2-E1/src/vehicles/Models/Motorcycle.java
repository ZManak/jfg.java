package vehicles.Models;

public class Motorcycle extends Vehicle implements Combustion {
    private int cylinderCapacity;
    private int motorPower;

    public Motorcycle(int id, String plate, String brand, String model, int year, double cost, int cylinderCapacity, int motorPower) {
        super(id, plate, brand, model, year, cost);
        this.cylinderCapacity = cylinderCapacity;
        this.motorPower = motorPower;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling...");
    }

    @Override
    public void getAntiquity() {
        System.out.println("The motorcycle is " + (2024 - getYear()) + " years old.");
    }
}
