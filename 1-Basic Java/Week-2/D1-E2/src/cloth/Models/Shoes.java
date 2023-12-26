package cloth.Models;

public class Shoes extends Cloth{
    public String material;
    public String closure;

    public Shoes(int code, String name, double price, String brand, String size, String color, String material, String closure) {
        super(code, name, price, brand, size, color);
        this.material = material;
        this.closure = closure;
    }
    public void showInfo(){
        System.out.println("This shoes are brand " + this.getBrand());
    }
}
