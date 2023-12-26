package vehicles.Models;

public class Car extends Vehicle implements Electric {
    private int batteryLife;
    private int autonomy;

    public Car(int id, String plate, String brand, String model, int year, double cost, int batteryLife, int autonomy) {
        super(id, plate, brand, model, year, cost);
        this.batteryLife = batteryLife;
        this.autonomy = autonomy;
    }

    @Override
    public void chargeEnergy() {
        System.out.println("Charging energy...");
    }

    @Override
    public void getAntiquity() {
        System.out.println("The car is " + (2024 - getYear()) + " years old.");
    }
}
