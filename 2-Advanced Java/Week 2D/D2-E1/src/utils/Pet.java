package utils;

public class Pet {
    private int id;
    private String species;
    private int age;
    private String name;

    public Pet() {
    }
    public Pet(String species, int age, String name) {
        this.id = java.util.UUID.randomUUID().hashCode();
        this.species = species;
        this.age = age;
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

}
