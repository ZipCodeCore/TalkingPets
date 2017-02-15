package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class AnimalHouse {
    // FIELDS
    private int numberOfPets;
    private List<Pet> petList = new ArrayList<Pet>();
    private OutPut outPut = new OutPut();

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
    public void createListOfPetObjects(int number) {
        for(int i=0;i<number;i++) {
            petList.add(createSinglePet());
        }
    }
    public Pet createSinglePet() {
        String name = outPut.promptForName();
        String type = outPut.promptForType().toLowerCase();
        Pet pet;
        switch(type) {
            case "dog":
                pet = new Dog(name,type);
                break;
            case "cat":
                pet = new Cat(name,type);
                break;
            case "cobra":
                pet = new Cobra(name,type);
                break;
            default:
                outPut.promptForProperType();
                type = "cobra";
                pet = new Cobra(name,type);
        }
        return pet;
    }
}
