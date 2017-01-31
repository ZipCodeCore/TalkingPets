package io.zipcoder.pets;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class Controller {
    PetManagement petManagement = new PetManagement();
    Display display = new Display();
    PetFactory petFactory = new PetFactory();

    public void askUserForNumberOfPets(){
        petManagement.numberOfPets = display.askUserForInt("How many pets do you have?");
    }

    public void askUserForPetInfo(){
        for (int i = 0; i < petManagement.numberOfPets; i++){
            petManagement.pets.add(petFactory.makeAPet(askUserForPetType(), askUserForPetName()));
        }
    }

    private String askUserForPetName(){
        return display.askUserForString("What is your pet's name?");
    }

    private String askUserForPetType(){
        return display.askUserForString("What kind of pet do you have?");
    }

    public void displayPet(){
        for(int i = 0; i < petManagement.numberOfPets; i++){
            display.displaySinglePet(petManagement.pets.get(i));
        }
    }
}
