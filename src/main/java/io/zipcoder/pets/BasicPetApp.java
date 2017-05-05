package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class BasicPetApp {

    static Pet petSelector(String pet) {
        if(pet.equalsIgnoreCase("Cat")) {
            Cat cat = new Cat();
            return cat;
        } else if(pet.equalsIgnoreCase("Dog")) {
            Dog dog = new Dog();
            return dog;
        } else if(pet.equalsIgnoreCase("Goldfish")){
            Goldfish goldfish = new Goldfish();
            return goldfish;
        } else {
            return null;
        }
    }

    static void printPets(Pet[] pets) {
        for (Pet p : pets) {
            System.out.println(p.getName() + " says " + p.speak() + "\n");
        }
    }



    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many pets you got?");
            Pet[] petList = new Pet[Integer.parseInt(scanner.nextLine())];
            for (int i = 0; i < petList.length; i++) {
                System.out.println("What kind of pet is pet number " + (i + 1) + "?");
                Pet pet = petSelector(scanner.nextLine());
                System.out.println("What's your pet's name?");
                pet.setName(scanner.nextLine());
                petList[i] = pet;
            }

            System.out.println();

            Arrays.sort(petList);
            printPets(petList);

            Arrays.sort(petList, new PetComparator());
            printPets(petList);


        } catch (Exception e) {
            System.out.println("That's not an acceptable pet. I'm done with you.");
        }

    }
}
