package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class OutPut {
    // SCANNER OBJECT
    Scanner input = new Scanner(System.in);

    // METHODS
    public int promptForNumberOfPets() {
        System.out.print("How many pets do you have? ");
        int number = input.nextInt();
        return number;
    }
    public String promptForName() {
        System.out.println("What is this pet's name? ");
        String name = input.nextLine();
        input.close();
        return name;
    }
    public String promptForType() {
        System.out.println("What type of animal is your pet, dog, cat, or cobra? ");
        String type = input.nextLine();
        input.close();
        return type;
    }
    public void displayPetInfo(Pet pet) {
        System.out.println(pet.getName() + " is a " + pet.getType());
    }
}
