package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetOwner {
    private final List<Pet> petsList;

    public PetOwner(Pet... pets) {
        if(pets!=null)
            this.petsList=new ArrayList<>(Arrays.asList(pets));
        else
            this.petsList=new ArrayList<>();
        for(Pet pet:petsList){
            pet.setOwner(this);
        }
    }

    public PetOwner() {
        petsList = null;
    }

    public Pet[] getPets() {
        return petsList.toArray(new Pet [petsList.size()]);
    }

    public void addPet(Pet pet) {
        petsList.add(pet);
    }
}
