package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pets.*;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    Console console = new Console(System.in, System.out);
    Pets[] setOfPets;

    public void run() {

        printInfo(getTypes(getNumberOfPets()));

    }

    public Integer getNumberOfPets(){

        int numberOfPets = console.getIntegerInput("How many pets do you have?");

        return numberOfPets;
    }


    public Pets[] getTypes(int numberOfPets){

        setOfPets = new Pets[numberOfPets];

        for (int index = 0; index < numberOfPets; index++) {
            String type = console.getStringInput("\nWhat type of pet is it?\n" +
                                                         " Options: Dog, Cat, Cow");
            switch(type.toLowerCase()){

                case "dog": setOfPets[index] = new Dog(getName()); break;
                case "cat": setOfPets[index] = new Cat(getName()); break;
                case "cow": setOfPets[index] = new Cow(getName()); break;
                default: console.println("\nNot a valid animal."); index -= 1; break;
            }
        }

        return setOfPets;
    }


    public String getName() {

        return console.getStringInput("\nWhat is the pet's name?");
    }


    public void printInfo(Pets[] pets){

        for (Pets pet: pets) {
            console.println(pet.toString());
        }
    }


}
