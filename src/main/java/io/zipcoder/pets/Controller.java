package io.zipcoder.pets;

import java.util.Collections;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class Controller {

    private Display display = new Display();
    private PetFactory petFactory = new PetFactory("", "");
    private PetManagement petManagement = new PetManagement();
    private int numberOfPets = 0;
    private String petType = "";
    private String petName = "";
    public PetComparator petComparator = new PetComparator();


    public void askUserForNumberOfPets(){
        petManagement.numberOfPets = display.askUserForNumberInput("How many pets do you have? ");
    }

    public void askUserForPetInfo(){
    //Get a loop to input all the questions
        for(int i = 0; i < petManagement.numberOfPets; i++){
            petType = askUserForPetType();
            petName = askUserForPetName();
            Pet petMade = petFactory.makeAPet(petType, petName);

            //Create an array of the pets
            petManagement.pets.add(petMade);
        }
        Collections.sort(petManagement.pets, petComparator); //Sort the array we created
    }

    private String askUserForPetName(){
        petName = display.askUserForString("What is the pet's name? ");
        return petName;
    }

    private String askUserForPetType(){
        petType = display.askUserForString("What type of pet is it? ");
        return petType;
    }

    public void displayPets(){
        for(int i = 0; i<petManagement.pets.size(); i++){
            System.out.print(petManagement.pets.get(i).getClass().getSimpleName().toString()+ ": ");
            System.out.print(petManagement.pets.get(i).getName() +" says ");
            System.out.print(petManagement.pets.get(i).speak()+ "\n");
        }

    }

    public void displaySinglePet(int index){

    }

    private void assignPet(Pet pet){
        for(int i = 0; i < numberOfPets; i++){
            petFactory.makeAPet(petType, petName);
        }
    }
}
