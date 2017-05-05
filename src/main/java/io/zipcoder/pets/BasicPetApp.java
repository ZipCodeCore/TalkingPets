package io.zipcoder.pets;

import java.util.ArrayList;
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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> petList = new ArrayList<Pet>();

        System.out.println("How many pets you got?");
        int numPets = Integer.parseInt(scanner.nextLine());

        try {

            for (int i = 0; i < numPets; i++) {
                System.out.println("What kind of pet is pet number " + (i + 1) + "?");
                Pet pet = petSelector(scanner.nextLine());
                System.out.println("What's your pet's name?");
                pet.name = scanner.nextLine();
                petList.add(pet);
            }

            System.out.println();

            for (Pet p : petList) {
                System.out.println(p.getName() + " says " + p.speak() + "\n");
            }

        } catch (Exception e) {
            System.out.println("That's not an acceptable pet. I'm done with you.");
        }

    }
}
