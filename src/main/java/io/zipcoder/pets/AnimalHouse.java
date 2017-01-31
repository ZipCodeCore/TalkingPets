package io.zipcoder.pets;

import java.util.List;
import java.util.Scanner;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class AnimalHouse {
    // FIELDS
    private int numberOfPets;
    private List<Pet> petList;
    private OutPut outPut = new OutPut();       // Please use this object to take in user input

    // CONSTRUCTORS
    public AnimalHouse(int number) {
        createListOfPetObjects(number);
        setNumberOfPets();
    }

    // SETTERS
    public void setNumberOfPets() { numberOfPets = petList.size(); }
    public void setPetList(List<Pet> petList) {}

    // GETTERS
    public int getNumberOfPets() { return numberOfPets; }
    public List<Pet> getPetList() { return petList; }

    // FACTORY METHOD
    public void createListOfPetObjects(int numberOfPets) {

        // Ask for number of pets, and loop through to add each one to List<Pets>

        // SUGGESTION: When prompting for user input, use classes from the "OutPut" object instantiated here.

        createSinglePet();              // Use this class at each iteration of "List<Pets>" creation loop.
    }
    public Pet createSinglePet() {

        // This method prompts inputs, then passes them into the Pet constructor to return a Pet Object.

        // SUGGESTION: Pet constructor can use "switch" statement to set new Pet into correct Child Class.

    }
}
