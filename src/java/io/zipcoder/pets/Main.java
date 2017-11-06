package io.zipcoder.pets;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static int getIntegerInput(String promptForUserInput) {
        String stringInput = getStringInput(promptForUserInput);
        int integerInput = Integer.parseInt(stringInput);
        return integerInput;
    }

    public static String getStringInput(String promptForUserInput) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(promptForUserInput);
        String userinput = scanner.nextLine();
        return userinput;
    }


    public static void main(String[] args) {
        String typeOfPet;
        String nameOfPet;

        ArrayList<Pet> petArrayList = new ArrayList<Pet>();

        int noOfPets = getIntegerInput("How many pets?");
        for (int i = 0; i < noOfPets; i++) {
            typeOfPet = getStringInput("Enter type of pet");
            nameOfPet = getStringInput("Enter name of pet");
            switch (typeOfPet.toUpperCase()) {
                case "DOG":
                    petArrayList.add(new Dog(nameOfPet));
                    break;
                case "CAT": petArrayList.add(new Cat(nameOfPet)); break;
                case "DUCK": petArrayList.add(new Duck(nameOfPet)); break;
                default:
                    System.out.println("Wrong pet type. Please try again");
                    break;

                    }

                }
            for(Pet pet: petArrayList){
                System.out.println(pet.getName() + " " + pet.Speak());
            }

        }

    }


