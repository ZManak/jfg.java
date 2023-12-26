package animal;

public class Reptile extends Animal{
    private String scales;
    private int length;
    private String reproductionType;
    private String habitat;

    public Reptile(int id, String name, int age, String skinType, String foodType, String scales, int length, String reproductionType, String habitat) {
        super(id, name, age, skinType, foodType);
        this.scales = scales;
        this.length = length;
        this.reproductionType = reproductionType;
        this.habitat = habitat;
    }

    public void greet() {
        System.out.println("Hello, I'm a reptile");
    }
}
