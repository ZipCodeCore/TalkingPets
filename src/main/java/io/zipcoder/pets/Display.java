package io.zipcoder.pets;

/**
 * Created by johnsquier on 1/31/17.
 */
public class Display
{
    public static String promptForNumberOfPets()
    {
        return "How many pets do you have?:";
    }

    public static String promptForTypeOfPet()
    {
        return "What kind of animal is this pet?:";
    }

    public static String promptForNameOfPet()
    {
        return "What is the name of this pet?:";
    }

    public static String displayPetInfo(Pet p)
    {
        return "I am " + p.getName() + " and I say " + p.speak();
    }
}
