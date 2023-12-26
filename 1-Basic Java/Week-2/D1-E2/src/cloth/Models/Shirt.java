package cloth.Models;

public class Shirt extends Cloth{
    public String sleeve;
    public String collar;

    public Shirt(int code, String name, double price, String brand, String size, String color, String sleeve, String collar) {
        super(code, name, price, brand, size, color);
        this.sleeve = sleeve;
        this.collar = collar;
    }
    public void showInfo(){
        System.out.println("This shirt is brand " + this.sleeve);
    }
}
