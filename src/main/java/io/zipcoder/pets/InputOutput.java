package io.zipcoder.pets;

import com.sun.tools.doclets.internal.toolkit.util.DocFinder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class InputOutput {
    Scanner scanner = new Scanner(System.in);
    PetDataWarehouse petDW = new PetDataWarehouse();
    private InputStream inputStream;

    public InputOutput(){};

    public InputOutput(InputStream stream) {
        inputStream = stream;
    }

    int askHowManyPets(){
        System.out.println("How many pets do you have?");
        int howMany = scanner.nextInt();
        scanner.nextLine();
        return howMany;

    };

    String askNameOfPet(){
        System.out.println("What's the name of pet?");
        return scanner.nextLine();
    };

    String askTypeOfPet() {
        System.out.println("What's the type of pet?");
        return scanner.nextLine();
    };

    void printListWithSpeak(ArrayList<Pet> petsList){
        for(Pet p : petsList) {
            System.out.println("The pet's name is " + p.getName() + " and when it " + p.speak() + "s when it speaks.");
        }
    };
}
