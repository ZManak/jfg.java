package animal;

public class Animal {
    protected int id;
    protected String name;
    protected int age;
    protected String skinType;
    protected String foodType;

    public Animal() {

    }
    public Animal(int id, String name, int age, String skinType, String foodType) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.skinType = skinType;
        this.foodType = foodType;
    }

    public void greet() {
        System.out.println("Hello, I'm an animal");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getSkinType() {
        return skinType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
