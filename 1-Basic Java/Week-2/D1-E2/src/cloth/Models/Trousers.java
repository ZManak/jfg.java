package cloth.Models;

public class Trousers extends Cloth {
    public String style;
    public String clothType;

    public Trousers(int code, String name, double price, String brand, String size, String color, String style, String clothType) {
        super(code, name, price, brand, size, color);
        this.style = style;
        this.clothType = clothType;
    }

    public void showInfo(){
        System.out.println("This trousers are brand " + this.style);
    }
}
