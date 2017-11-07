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
        System.out.println("Please enter how many pets you have.");
        this.numberOfPets = SanitizeTools.getEnforcedIntegerInput();
        System.out.println("So you have "+numberOfPets+" pets.");
    }

    private void inputKindAndNameOfPets() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        for (int i = 0; i < numberOfPets; i++) {
            Pet pet;
            input = getType(scanner, i);
            pet = getPetOfType(input);
            pets.add(pet);
            getAndSetName(scanner, pet);
        }
    }

    private String getType(Scanner scanner, int i) {
        String input;
        do{
            System.out.println("what kind of pet is pet#"+(i+1)+"? {Cat, Dog, or Lion?}");
            input = scanner.nextLine();
        }while(!"cat".equalsIgnoreCase(input) && !"dog".equalsIgnoreCase(input) && !"lion".equalsIgnoreCase(input));
        return input;
    }

    private void getAndSetName(Scanner scanner, Pet pet) {
        String input;
        System.out.println("What is this "+pet.getClass().getSimpleName()+"'s name?");
        input = scanner.nextLine();
        pet.setName(input);
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

    private void printListOfPets() {
        System.out.println("These are all your pets:");
        int i = 1;
        for (Pet pet: pets) {
            System.out.println("Pet#"+i+": "+pet.toString());
            i++;
        }
    }
}
