package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    static Scanner scanner;
    static ArrayList<Pet> pets = new ArrayList();

    public static int getNumberOfPets() {
        scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();
        return numberOfPets;
    }

    public static void addPetsToArrayList(){
        scanner = new Scanner(System.in);
        System.out.println("What type of pet do you have?");
        String petType = scanner.nextLine();
        petType = petType.trim();
        petType = petType.substring(0,1).toUpperCase() + petType.substring(1).toLowerCase();
        switch (petType) {
            case "Cat":
                Cat cat = new Cat();
                System.out.println("What the cat's name?");
                String catsName = scanner.nextLine();
                cat.setName(catsName);
                pets.add(cat);
                break;
            case "Dog":
                Dog dog = new Dog();
                System.out.println("What's the dog's name?");
                String dogsName = scanner.nextLine();
                dog.setName(dogsName);
                pets.add(dog);
                break;
            case "Parrot":
                Parrot parrot = new Parrot();
                System.out.println("What's the parrot's name?");
                String parrotsName = scanner.nextLine();
                parrot.setName(parrotsName);
                pets.add(parrot);
                break;
            default:
                addPetsToArrayList();
                break;
        }
    }


    public static void main(String[] args) {
        int numberOfPets = getNumberOfPets();
        for (int i = 0; i < numberOfPets; i++) {
            addPetsToArrayList();
        }

        for (Pet pet: pets) {
            System.out.println(pet.getClass().getSimpleName() + "\n" +
                    pet.getName() + "\n" +
                    pet.speak());
        }

    }
}
