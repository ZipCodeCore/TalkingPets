package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pets.Cat;
import io.zipcoder.polymorphism.Pets.Cow;
import io.zipcoder.polymorphism.Pets.Dog;
import io.zipcoder.polymorphism.Pets.Pets;

import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    Scanner scanner = new Scanner(System.in);
    Pets[] setOfPets;

    public void run() {

        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();
        setOfPets = new Pets[numberOfPets];

        getTypesAndNames(numberOfPets, setOfPets);

        printInfo(setOfPets);

    }


    public Pets[] getTypesAndNames(int numberOfPets, Pets[] pets){

        for (int index = 0; index < numberOfPets; index++) {
            System.out.println("What type of pet is it?\n" +
                               " Options: Dog, Cat, Cow, Other");
            String input = scanner.next();

            System.out.println("What is the pet's name?");
            String name = scanner.next();

            if ("dog".equals(input)) {

                pets[index] = new Dog(name);

            } else if ("cat".equals(input.toLowerCase())) {

                pets[index] = new Cat(name);

            } else if ("cow".equals(input.toLowerCase())){

                pets[index] = new Cow(name);

            } else{

                pets[index] = new Pet(name);
            }
        }

        return pets;
    }


    public void printInfo(Pets[] pets){

        for (Pets pet: pets) {
            System.out.println(pet.outputPet());
        }
    }


}
