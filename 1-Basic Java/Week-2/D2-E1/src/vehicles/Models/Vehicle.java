package vehicles.Models;

public abstract class Vehicle {
    private int id;
    private String plate;
    private String brand;
    private String model;
    private int year;
    private double cost;

    public Vehicle(int id, String plate, String brand, String model, int year, double cost) {
        this.id = id;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract void getAntiquity();
}
