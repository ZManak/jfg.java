package animal;

public class Bird extends Animal{
    private String flightType;
    private int wingspan;
    private String feathers;
    private String beakType;

    public Bird(int id, String name, int age, String skinType, String foodType, String feathers, int wingspan, String flightType, String beakType) {
        super(id, name, age, skinType, foodType);
        this.feathers = feathers;
        this.wingspan = wingspan;
        this.flightType = flightType;
        this.beakType = beakType;
    }

    public void greet() {
        System.out.println("Hello, I'm a bird");
    }
}
