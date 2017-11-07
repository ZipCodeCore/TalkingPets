package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleInput {

    void startQuestions() {
        System.out.println("Hey there! This program is here to record your annoying pets!!");
        int num = Console.getIntInput("How many annoying pets do you own?");

        System.out.println("Oh my, you have " + num + " annoying pets!!!");

        for (int i = 1; i <= num; i++) {
            createAnimal();
        }
        System.out.println(Pet.getPetsInArray());
    }

    public void createAnimal() {
        String name = Console.getStringInput("What is the name?");

        do {
            String typeOfAnimal = Console.getStringInput("What type of animal is it?");
            Pet pet;

            switch (typeOfAnimal.toLowerCase()) {
                case "dog":
                    pet = new Dog(name);
                    break;

                case "cat":
                    pet = new Cat(name);
                    break;

                case "bird":
                    pet = new Bird(name);
                    break;

                default:
                    System.out.println("Invalid animal, please respond with dog, cat, or bird.");
                    continue;
            }

            pet.addToPetsNameArray(name);
            pet.addToPetArray(pet);
            break;
        } while (true);
    }
}


