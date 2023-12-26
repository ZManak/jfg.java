import animal.*;

public class Main {
    public static void main(String[] args) {
        Mammal mammal = new Mammal(1, "Mammal", 10, "Fur", "Omnivore", 4, "Brown", "Viviparous", "Land");
        Bird bird = new Bird(2, "Bird", 5, "Feathers", "Omnivore", "Feathers", 10, "Flapping", "Pointed");
        Reptile reptile = new Reptile(3, "Reptile", 2, "Scales", "Carnivore", "Dry", 10, "Lay eggs", "Land");

        mammal.greet();
        bird.greet();
        reptile.greet();
    }
}
