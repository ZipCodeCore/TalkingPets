package io.zipcoder.pets;

/**
 * @author John A. Squier
 * @author Michael Wolfe
 * A main class that Michael Wolfe will implement.
 */
public class Main
{
    public static void main(String[] args)
    {
        // get number of pets user has
        System.out.print(promptForNumberOfPets());
        int numberOfPets = getNumberOfPetsUserHas();

        // create an array to store user input
        Pet[] userPets = new Pet[numberOfPets];
        //String[] userInput = new String[numberOfPets*2]; // original implementation

        for ( int i = 0; i < numberOfPets; i++ )
        {
            System.out.print(promptForTypeOfPetUserHas());

            switch ( getTypeOfPetUserHas().toLowerCase() )
            {
                case "dog":
                    userPets[i] = new Dog();
                    break;
                case "cat":
                    userPets[i] = new Cat();
                    break;
                case "goat":
                    userPets[i] = new Goat();
                    break;

                // unknown pet types are dogs
                default:
                    userPets[i] = new Dog();
            }

            System.out.print(promptForNameOfPetUserHas());
            userPets[i].setName(getNameOfPetUserHas());
        }

        // print out pets
        for ( int i = 0; i < numberOfPets; i++ )
        {
            System.out.println(userPets[i]);
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
