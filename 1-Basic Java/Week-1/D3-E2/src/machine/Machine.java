package machine;

public class Machine {
    int id;
    String manufacturer;
    String model;
    int consumption;
    String color;

    public Machine() {

    }

    public Machine(int id, String manufacturer, String model, int consumption, String color) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.consumption = consumption;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println("Machine ID: " + id);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Consumption: " + consumption);
        System.out.println("Color: " + color);
    }
}
