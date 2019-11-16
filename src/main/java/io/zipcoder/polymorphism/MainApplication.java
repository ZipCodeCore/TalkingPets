package io.zipcoder.polymorphism;

import io.zipcoder.pets.Bear;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many pets do you have?");
        Integer numberOfPets = input.nextInt();
        ArrayList<Pet> petList = new ArrayList<Pet>();
        for (int i = 1; i <= numberOfPets; i++) {
            String petType = getTypeOfPet().toLowerCase();
            String petName = getPetName();
            if (petType.equals("dog")) {
                Dog dog = new Dog(petName);
                petList.add(dog);
            }
            if (petType.equals("cat")) {
                Cat cat = new Cat(petName);
                petList.add(cat);
            }
            if (petType.equals("bear")) {
                Bear bear = new Bear(petName);
                petList.add(bear);
            }
            if (petType.equals("pet")){
                Pet pet = new Pet(petName);
                petList.add(pet);
            }
        }
        for (int i = 1; i <= petList.size(); i++)
        System.out.println(petList.get(i-1).getName()+" || "+ petList.get(i-1).speak());
    }



    public static String getTypeOfPet(){
        System.out.println("What kind of pet?");
        String petType = input.next();
        return petType;
    }

    public static String getPetName() {
        System.out.println("What is the name of your pet?");
        String petName = input.next();
        return petName;
    }
}









