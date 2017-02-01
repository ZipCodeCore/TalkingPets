package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class Display {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);

    public int askUserForInt(String question){
        System.out.println(question);
        return scanner.nextInt();
    }

    public String askUserForString(String question){
        System.out.println(question);
        return scanner1.nextLine();
    }

    public void displaySinglePet(Pet pet){
        System.out.println(pet.getName() + " is a " + pet.getClass().getSimpleName() + " and goes " + pet.speak());
    }
}
