package cloth.Models;

public class Cloth {
    private int code;
    private String name;
    private double price;
    private String brand;
    private String size;
    private String color;

    public Cloth(int code, String name, double price, String brand, String size, String color) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public Cloth() {
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo(){
        System.out.println("This cloth is brand " + this.getBrand());
    }
}
