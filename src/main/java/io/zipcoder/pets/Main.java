package io.zipcoder.pets;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class Main {
    public static OutPut outPut = new OutPut();


    public static void main(String[] args) {
        AnimalHouse animalHouse = new AnimalHouse(outPut.promptForNumberOfPets());
        for(Pet pet : animalHouse.getPetList()) {
            outPut.displayPetInfo(pet);
        }

    }

}
