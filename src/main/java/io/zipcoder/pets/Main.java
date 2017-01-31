package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author John A. Squier
 */
public class Main
{
    private static Display display = new Display();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        List<Pet> list = new ArrayList<Pet>();
        Pet pet;
        int numberOfPets;
        String petType;
        String petName;

        System.out.println(display.promptForNumberOfPets());
        numberOfPets = getNumberOfPets();

        for ( int i = 0; i < numberOfPets; i++ )
        {
            System.out.println(display.promptForTypeOfPet());
            petType = getTypeOfPet();

            // can be refactored into PetFactory
            switch ( petType.toLowerCase() )
            {
                case "dog":
                    pet = new Dog();
                    break;
                case "cat":
                    pet = new Cat();
                    break;
                case "pig":
                    pet = new Pig();
                    break;
                default: // unknown pets are dogs
                    pet = new Dog();
                    break;
            }

            System.out.println(display.promptForNameOfPet());
            pet.setName(getNameOfPet());

            list.add(pet);
        }

        // print out pet info
        for ( Pet p : list )
        {
            System.out.println(display.displayPetInfo(p));
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
