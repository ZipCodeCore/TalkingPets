package kalaygian.dennis.partone;

import java.util.Scanner;

/**
 * Created by denniskalaygian on 5/2/17.
 */
public class Main {
    public static void main(String[] args) {
       Main main = new Main();
       main.test();
    }

    private void test()  {
        int numberOfPets = 0;
        numberOfPets = getIntegerInput("How many pets do you have?");
        Pet[] pets = new Pet[numberOfPets];
        try {
            pets = fillPetList(pets, numberOfPets);
            displayPet(pets);
        }catch(Exception e){
            System.out.println("Let's try this again. This time, please enter a valid name. \n");
            test();
        }
    }

    private String getStringInput(String prompt) {
        Scanner in = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = in.nextLine();
        return userInput;
    }

    private Integer getIntegerInput(String prompt) {
        try {
            return Integer.parseInt(getStringInput(prompt));
        }catch(Exception e){
            System.out.println("Please input a valid integer. \n");
            return getIntegerInput(prompt);
        }
    }

    private Object instantiatePet(String typeOfPet) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        typeOfPet = formatClassName(typeOfPet);
        Class c = Class.forName(typeOfPet);
        Object pet = c.newInstance();
        ((Pet) pet).setName(getStringInput("What's it's name?"));
        return pet;
    }

    private String formatClassName(String typeOfPet){
        return "kalaygian.dennis.".concat(typeOfPet.substring(0,1).
                toUpperCase().concat(typeOfPet.substring(1).toLowerCase()));
    }

    private void displayPet(Pet[] pets){
        for(int i = 0; i < pets.length; i++){
            System.out.print(pets[i].getName() + ":" + pets[i].speak() + " " + "\n");
        }
    }

    private Pet[] fillPetList(Pet[] pets, int numberOfPets) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        for (int i = 0; i < numberOfPets; i++) {
            String typeOfPet = getStringInput("What type of pet is it?");
            pets[i] = (Pet)instantiatePet(typeOfPet);
        }
        return pets;
    }
}


