package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class PetDataWarehouse {
    ArrayList<Pet> petsList = new ArrayList<Pet>();
    int numberOfPets;
    PetComparator petComparator = new PetComparator();

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

    void addPet(Pet pet) {
        petsList.add(pet);
        Collections.sort(petsList);
    }

    String returnListAsString(ArrayList<Pet> petList) {
        String listAsString = "";
        for (Pet p: petList) {
            listAsString.concat(p.getName() + " " + p.getClass() + "\n");
        }
        return listAsString;
    }

    public ArrayList<Pet> sortByName(ArrayList<Pet> petsList) {
        Collections.sort(petsList);
        return petsList;
    }

    public ArrayList<Pet> sortByType(ArrayList<Pet> petsList) {
        Collections.sort(petsList, petComparator);
        return petsList;
    }
}
