package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Create a program that asks the user how many pets they have. Once you know how many pets they have, ask them
//        what kind of pet each one is, along with each pet's name. For now your program should just hold onto the user
//        input and print out the list at the end; we'll modify this in part 3.
//

        Scanner scan = new Scanner(System.in);

        Integer numberOfPets = 0;
        ArrayList<Pet> pets = new ArrayList<Pet>();

        System.out.println("How many pets do you have?");
        numberOfPets =Integer.parseInt(scan.nextLine());

        for(int i = 1; i<=numberOfPets; i++) {

            System.out.println("And pet " + i  + " is a...?");
            String pet = scan.nextLine();
            System.out.println("What's it named?");
            String name = scan.nextLine();

            if (pet.equalsIgnoreCase("Dog")) {
                Dog dog = new Dog(name);
                pets.add(dog);
            } else if (pet.equalsIgnoreCase("Cat")) {
                Cat cat = new Cat(name);
                pets.add(cat);
            } else if (pet.equalsIgnoreCase("Fish")) {
                Fish fish = new Fish(name);
                pets.add(fish);
            } else {
                Pet otherPet = new Pet(name);
                pets.add(otherPet);
            }

        }


        for(int i =0; i<pets.size(); i++){
            System.out.println("You have a " + pets.get(i).getClass().getSimpleName() + " named " + pets.get(i).getName() +".");
        }
}
}



