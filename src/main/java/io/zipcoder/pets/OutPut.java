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
        System.out.print("What is this pet's name? ");
        String name = input.nextLine();
        return name;
    }
    public String promptForType() {
        System.out.print("What type of animal is your pet, a dog, cat, or cobra? ");
        String type = input.nextLine();
        return type;
    }
    public void promptForProperType() {
        System.out.println("I'm sorry, what sort of pet is that? I guess you really want a cobra\n");
    }
    public void displayPetInfo(Pet pet) {
        System.out.println(pet.getName() + " is a " + pet.getType() + ", and " + pet.getType() + "s say \"" + pet.speak() + "\"\n");
    }
}
