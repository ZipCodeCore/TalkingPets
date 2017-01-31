package io.zipcoder.pets;

import java.util.ArrayList;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class PetDataWarehouse {
    ArrayList<Pet> petsList = new ArrayList<Pet>();
    int numberOfPets;
    PetGenerator petGenerator = new PetGenerator();

    public ArrayList<Pet> getPetsList() {
        return petsList;
    }

    public void setPetsList(ArrayList<Pet> petsList) {
        this.petsList = petsList;
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    void addPet(String name, String type) {}
}
