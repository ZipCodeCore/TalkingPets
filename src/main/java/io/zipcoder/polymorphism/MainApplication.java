package io.zipcoder.polymorphism;

import com.sun.xml.internal.ws.api.pipe.Engine;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    static ArrayList<Pet> petArrayL = new ArrayList<Pet>();

    public static void main(String[] args) {
        int petNumber;
        String petName;
        String petType;

        System.out.println("How many pets do you have?");
        Scanner scanner = new Scanner(System.in);
        petNumber = scanner.nextInt();

        for (int i = 1; i <= petNumber; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("What type of pet do you have?");
            petType = scanner1.nextLine();

            System.out.println("What is the name of the pet?");
            petName = scanner1.nextLine();
            switch (petType.toLowerCase()) {
                case "dog":
                    petArrayL.add(new Dog(petType, petName));
                    break;
                case "cat":
                    petArrayL.add(new Cat(petType, petName));
                    break;
                case "bird":
                    petArrayL.add(new Snake(petType, petName));
                    break;
                default:
                    System.out.println("Enter dog, cat, or snake");
                    break;
            }
        }

        printPetsInformation();


    }

    private static void printPetsInformation() {
        for (Pet petObj : petArrayL) {
            String petName = petObj.getName();
            String petSpeech = petObj.speak();

            System.out.println("The pet's name is " + petName);
            System.out.println("The pet says " + petSpeech);
        }
    }

}
