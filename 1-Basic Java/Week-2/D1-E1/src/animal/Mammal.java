package animal;

public class Mammal extends Animal{
    private int legs;
    private String skinColor;
    private String reproductionType;
    private String habitat;

    public Mammal(int id, String name, int age, String skinType, String foodType, int legs, String skinColor, String reproductionType, String habitat) {
        super(id, name, age, skinType, foodType);
        this.legs = legs;
        this.skinColor = skinColor;
        this.reproductionType = reproductionType;
        this.habitat = habitat;
    }

    public void greet() {
        System.out.println("Hello, I'm a mammal");
    }
}
