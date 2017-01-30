package io.zipcoder.pets;

/**
 * Created by johnsquier on 1/30/17.
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.print(promptForNumberOfPets());
        int numberOfPets = getNumberOfPetsUserHas();

        //Pet[] usersPets = new Pet[numberOfPets]; for polymorphism
        String[] userInput = new String[numberOfPets*2];

        for ( int i = 0; i < numberOfPets; i++ )
        {
            System.out.print(promptForTypeOfPetUserHas());
            userInput[i] = getTypeOfPetUserHas();

            System.out.print(promptForNameOfPetUserHas());
            userInput[i+1] = getNameOfPetUserHas();
        }

        for ( int i = 0; i < numberOfPets*2; i++ )
        {
            System.out.println(userInput[i]);
        }

    }

    public static String promptForNumberOfPets()
    {
        return null;
    }

    public static String promptForTypeOfPetUserHas()
    {
        return null;
    }

    public static String promptForNameOfPetUserHas()
    {
        return null;
    }

    public static int getNumberOfPetsUserHas()
    {
        return -1;
    }

    public static String getTypeOfPetUserHas()
    {
        return null;
    }

    public static String getNameOfPetUserHas()
    {
        return null;
    }
}
