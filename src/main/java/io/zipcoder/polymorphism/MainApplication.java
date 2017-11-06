package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    static Scanner sc;

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        int numOfPets = getInt("How many pets do you have?");

        for (int x = 1; x <= numOfPets; x++) {
            addPet(pets);
        }

        for (int x = 0; x < pets.size(); x++) {
            System.out.println(pets.get(x).getName()+" says: "+pets.get(x).speak());
        }

    }

    public static void addPet(ArrayList<Pet> pets) {
        String petType = getString("What type of pet do you have? (Cat, Dog, Goat)");
        String petName = getString("What is the name of your pet?");

        if ("Cat".equalsIgnoreCase(petType)) {
            Cat aCat = new Cat(petName);
            pets.add(aCat);
        }
        else if ("Dog".equalsIgnoreCase(petType)) {
            Dog aDog = new Dog(petName);
            pets.add(aDog);
        }
        else if ("Goat".equalsIgnoreCase(petType)) {
            Goat aGoat = new Goat(petName);
            pets.add(aGoat);
        }
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
