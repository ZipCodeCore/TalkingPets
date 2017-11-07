package io.zipcoder.polymorphism;

import io.zipcoder.Utils.SanitizeTools;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Lion;
import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {

    int numberOfPets;
    ArrayList<Pet> pets = new ArrayList<>();

    public void run() {
        inputNumberOfPets();
        inputKindAndNameOfPets();
        printListOfPets();
    }

    private void inputNumberOfPets() {
        this.numberOfPets = SanitizeTools.getPositiveIntegerInput("Please enter how many pets you have.");
        System.out.println("So you have "+numberOfPets+" pets.");
    }

    private void inputKindAndNameOfPets() {
        String input = "";
        Pet pet;
        for (int i = 0; i < numberOfPets; i++) {
            pet = getPetOfType(i);
            pets.add(pet);
            getPetName(pet);
        }
    }

    private Pet getPetOfType(int i) {
        String input;
        Pet pet;
        do{
            input = SanitizeTools.getStringInput("what kind of pet is pet#"+(i+1)+"? {Cat, Dog, or Lion?}");
        } while (!"cat".equalsIgnoreCase(input) && !"dog".equalsIgnoreCase(input) && !"lion".equalsIgnoreCase(input));
        pet = getPetOfType(input);
        return pet;
    }

    private Pet getPetOfType(String input) {
        switch(input.toLowerCase()){
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            case "lion":
                return new Lion();
            default:
                System.out.println("Sorry, we don't know what those are.");
                return null;
        }
    }

    private void getPetName(Pet pet) {
        String input;
        input = SanitizeTools.getStringInput("What is this "+pet.getClass().getSimpleName()+"'s name?");
        pet.setName(input);
    }

    private void printListOfPets() {
        System.out.println("These are all your pets:");
        int i = 1;
        for (Pet pet: pets) {
            System.out.println("Pet#"+i+": "+pet.toString());
            i++;
        }
    }
}
