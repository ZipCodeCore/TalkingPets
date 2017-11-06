package io.zipcoder.pets;

import com.sun.deploy.security.ValidationState;
import com.sun.xml.internal.bind.util.Which;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        int noOfPets;
        String typeOfPet;
        String nameOfPet;
        ArrayList<Pet> petArrayList = new ArrayList<Pet>();

        Scanner scanner = new Scanner(System.in);
        //How many pets?

        System.out.println("How many pets?");
        noOfPets = scanner.nextInt();

        for (int i = 0; i < noOfPets; i++) {
            System.out.println("Enter type of pet: "); //+ typeOfPet + "Enter name of per: " + nameOfPet);
            typeOfPet = scanner.nextLine();

            System.out.println("Enter name of pet: ");
            nameOfPet = scanner.nextLine();
        }


        switch (scanner.nextLine()) {
            case "Dog":
            case "Cat":
            case "Bird":

        }
    }
}
