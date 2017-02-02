package holland.andres;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by andresholland on 1/31/17.
 */
public class IO {

    public int askHowManyPets () {
        System.out.println("How many pets do you have?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String askNameOfPet () {
        System.out.println("What is the name of the pet?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String askTypeOfPet () {
        System.out.println("What type of pet is this?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void printListOfPets (ArrayList<Pet> pets) {
        for (Pet pet : pets) {
            System.out.println("Name is: " + pet.getName() + " and it says " + pet.speak());
        }
    }

}
