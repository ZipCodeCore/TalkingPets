package io.zipcoder.pets;
import io.zipcoder.pets.Display;
import io.zipcoder.pets.PetFactory;
import io.zipcoder.pets.PetManagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tolaniibikunle on 1/31/17.
 */
public class Controller {
    PetManagement petManagement = new PetManagement();
    Display display = new Display();
    PetFactory petFactory = new PetFactory();


    public void runProgram(){
        int numberOfPets = askForNumberOfPets();
        for (int i = 0; i < numberOfPets; i++) {
            askUserForPetInfo();
        }
    }

    public int askForNumberOfPets() {
    // asking for number of pets
        int number = display.askUserForTheAmountOfPets("How many pets do you have? ");
        return number;
    }

    public void askUserForPetInfo(){
        //asking user for pet info by calling these two private methods below
        String petType = askUserForPetType();
        String petName = askUserForPetName();
        assignPet(petFactory.makeAPet(petType,petName));

    }

    private String askUserForPetType(){
        String petType = display.askUserForThePetNameAndType("What type of pets do you have?");
        return petType;
    }
    private String askUserForPetName(){
        String petName = display.askUserForThePetNameAndType("What is your pet name ?");
        return petName;

    }
    public void displayPet(){
        for (int i = 0; i <petManagement.Pets.size() ; i++) {
            System.out.println(displayIndividualPet(petManagement.Pets,i)); // because this method takes two parameters, we have to pass the arraylist,
            //and the number of pets in the array

        }
    }


    public String displayIndividualPet(ArrayList<Pet> pets,int index) {
        //here we are creating a string called individual pet, that goes into the arraylist pet.gets. the name and then gets the index
        //of that pet.
        String individualPet = pets.get(index).getName() + " " + pets.get(index).getClass().getSimpleName();
        return individualPet;
    }

    public void assignPet(Pet pets ) { // i am assigning a type object pet and adding the pet object to the arraylist Pet.
        petManagement.Pets.add(pets);


    }

    }



