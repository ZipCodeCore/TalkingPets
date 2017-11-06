package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    private static ArrayList<Pet> pets = new ArrayList<Pet>();
    private static Scanner input;


    public static void main(String[] args) {


        input = new Scanner(System.in);
        int number = Integer.parseInt(getUserInput("How many pets do you have?"));


        for (int i = 0; i < number; i++) {
            System.out.println("What type of pet do you have? (Cat, Dog, or Otter)");
            String petType = input.next();
            if (petType.equalsIgnoreCase("cat")) {
               createCat();
            } else if (petType.equalsIgnoreCase("dog")) {
                createDog();
            } else if (petType.equalsIgnoreCase("otter")) {
               createOtter();
            } else {
                System.out.println("Invalid pet type. Please re-enter.");
                i--;
            }
        }
            for (Pet pet : pets) {
                System.out.println(pet.getName() + " is a[n] " + pet.getClass().getSimpleName() + " and goes " + pet.speak());
            }
    }

    private static void createCat() {
        Pet aCat = new Cat();
        input = new Scanner(System.in);
        System.out.println("What is the name of the cat?");
        String petName = input.next();
        aCat.setName(petName);
        pets.add(aCat);
    }

    private static void createDog() {
        Pet aDog = new Dog();
        input = new Scanner(System.in);
        System.out.println("What is the name of the dog?");
        String petName = input.next();
        aDog.setName(petName);
        pets.add(aDog);
    }

    private static void createOtter() {
        Pet anOtter = new Otter();
        System.out.println("What is the name of the otter?");
        String petName = input.next();
        anOtter.setName(petName);
        pets.add(anOtter);
    }

    private static String getUserInput(String message) {
        input = new Scanner(System.in);
        System.out.println(message);
        return input.nextLine();
    }

//    private static int getUserInputInt (String message) {
//        input = new Scanner(System.in);
//        System.out.println(message);
//        return input.nextInt();
//    }

}
