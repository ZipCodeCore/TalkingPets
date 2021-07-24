package io.zipcoder.polymorphism;


import java.security.DigestException;

public class MainApplication {
    public static void main(String[] args) {
        Integer numPets = Console.getIntegerInput("Hey you! How many pets do you own?");
        if(numPets > 0) {
            for(int i = 0; i < numPets; i++){
                String petType = Console.getStringInput("What kind of pet do you own?\n" + "Dog \n" + "Cat \n" + "Chicken \n");

                String petName = Console.getStringInput("What is the name of your pet? \n");

                System.out.println("Wow I like your pet name! Goodbye!");




                }

            }

    }

}
