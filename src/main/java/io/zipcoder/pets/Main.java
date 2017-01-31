package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author John A. Squier
 */
public class Main
{
    // scanner is a field so I don't have to pass it to the getInput methods
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        CanCreatePets petFactory = new PetFactory();
        List<Pet> list = new ArrayList<>();

        System.out.println(Display.promptForNumberOfPets());
        int numberOfPets = getNumberOfPets();

        for ( int i = 0; i < numberOfPets; i++ )
        {
            System.out.println(Display.promptForTypeOfPet());

            Pet pet = petFactory.createPet(getTypeOfPet());

            System.out.println(Display.promptForNameOfPet());
            pet.setName(getNameOfPet());

            list.add(pet);
        }

        // print out pet info
        for ( Pet p : list )
        {
            System.out.println(Display.displayPetInfo(p));
        }

    }

    public static int getNumberOfPets()
    {
        int x = scanner.nextInt();
        scanner.nextLine();
        return x;
    }

    public static String getTypeOfPet()
    {
        return scanner.nextLine();
    }

    public static String getNameOfPet()
    {
        return scanner.nextLine();
    }
}
