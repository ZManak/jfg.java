import utils.Pet;
import utils.PetRegistry;

public class Main {
    public static void main(String[] args) {
        PetRegistry<Pet> petRegistry = new PetRegistry<>();
        for (int i = 0; i < 10; i++) {
            Pet pet = petRegistry.generatRandomPet();

            petRegistry.add(pet);
        }
        System.out.println(petRegistry.size());
        System.out.println(petRegistry.searchByName("Buddy"));
        System.out.println(petRegistry.searchBySpecies("Dog"));
    }
}
