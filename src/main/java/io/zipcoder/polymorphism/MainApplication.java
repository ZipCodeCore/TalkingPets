package io.zipcoder.polymorphism;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    public static void main(String[] args) {
        petApp();
    }

    public static void petApp() {
        Integer numberOfPets = getNumberOfPets();
        Console.println("Can you tell me some more about your %s pets?", numberOfPets);

        String[] petTypes = new String[numberOfPets];
        String[] petNames = new String[numberOfPets];
        for (int i = 0; i < numberOfPets; i++) {
            petNames[i] = Console.getStringInput(String.format("What is pet %s's name? ", i+1));
            petTypes[i] = Console.getStringInput(String.format("What kind of pet is %s? ", petNames[i]));
        }
        PetWarehouse petWarehouse = new PetWarehouse(numberOfPets, petTypes, petNames);
        Console.print(petWarehouse.displayPetInfo());
    }

    public static Integer getNumberOfPets() {
        return Console.getIntegerInput("How many pets do you have? ");
    }






}
