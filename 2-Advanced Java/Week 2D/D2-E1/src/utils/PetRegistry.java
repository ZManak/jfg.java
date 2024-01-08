package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PetRegistry<Pet>  {

    private List<Pet> pets = new ArrayList<>();

    public PetRegistry(List<Pet> pets) {
        this.pets = pets;}

    public PetRegistry() {

    }

    public void add(Pet pet) {
        pets.add(pet);
    }

    public List<Pet> searchByName(String name) {
        return this.pets.stream()
                       .filter(pet -> {
                           return pet.getName().equals(name);
                       })
                          .collect(Collectors.toList());
    }

    public List<Pet> searchBySpecies(String species) {
        List<Pet> list = new ArrayList<>();
        for (Pet pet : this.pets) {
            if (pet.getSpecies().equals(species)) {
                list.add(pet);
            }
        }
        return list;
    }
        public int size
        ()
        {
            return pets.size();
        }

        public Pet generatRandomPet
        ()
        {
            String[] species = {"Dog", "Cat", "Bird", "Fish", "Hamster"};
            String[] names = {"Buddy", "Max", "Charlie", "Jack", "Cooper", "Rocky", "Bear", "Duke", "Tucker", "Oliver", "Bella", "Lucy", "Luna", "Daisy", "Lola", "Sadie", "Molly", "Bailey", "Maggie", "Stella"};
            int[] ages = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int randomSpecies = (int) (Math.random() * species.length);
            int randomName = (int) (Math.random() * names.length);
            int randomAge = (int) (Math.random() * ages.length);

            final Pet pet = new Pet(species[randomSpecies], ages[randomAge], names[randomName]);
            return pet;
        }


}
