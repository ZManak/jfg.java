package cloth.Models;

public class Hat extends Cloth{
    public String type;
    public String size2;

    public Hat(int code, String name, double price, String brand, String size, String color, String type, String size2) {
        super(code, name, price, brand, size, color);
        this.type = type;
        this.size2 = size2;
    }
    public void showInfo(){
        System.out.println("This hat is brand " + this.type);
    }
}
