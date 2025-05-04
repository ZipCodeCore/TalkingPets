package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetOwner {
    private String name;
    private ArrayList<Pet> petList = new ArrayList<>();
    private static Integer ID = 0;
    //private Integer numberOfPets;

    public PetOwner(String name, int numOfPets) {
        this.name = name;
        this.petList = new ArrayList<>();
        for (int i = 0; i < numOfPets; i++) {
            petList.add(new Dog("TEST DOG", 90));
        }
    }

    public String getName() {
        return name;
    }

    public void setNumberOfPets(Integer newNumOfPets) {
        for (int i = 0; i < newNumOfPets; i++) {
            petList.add(new Dog("TEST DOG", 80));
        }
    }

    public int getNumberOfPets() {
        return petList.size();
    }

    public void addPet(Pet pet) {
        for(Pet element: petList){
            if(element != pet){
                element = pet;
                break;
            }
        }

    }

    public Pet getPetById(Integer petId) {
        for(Pet pet: petList){
            System.out.println(pet.getId());
            if(pet.getId() == petId){
                return pet;
            }
        }
        return null;
    }

    public void setPetName(Pet pet, String newPetName) {

    }
}
