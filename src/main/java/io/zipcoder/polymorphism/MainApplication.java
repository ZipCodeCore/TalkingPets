package io.zipcoder.polymorphism;

import io.zipcoder.common.Console;

public class MainApplication {
    public static void main(String[] args) {
        Console.printWelcome();
        Integer numberOfPets = Console.getIntegerInput("How many pets do you have? \n");
        Pet pet = new Pet();

        for (int i = 0; i < numberOfPets; i++) {

            Integer options = Console.getIntegerInput("What type of pet do you have?Enter a number \n" + "1.Dog \n"
                    + "2.Cat \n" + "3.Rabbit \n");
            String name = Console.getStringInput("what is his/her name? \n");

        switch(options) {
            case 1:
                Dog dog = new Dog(name, null, null);
                pet.addPet(pet);
                break;
            case 2:
                Cat cat = new Cat(name, null, null);
                pet.addPet(pet);
                break;
            case 3:
                Rabbit rabbit = new Rabbit(name, null, null);
                pet.addPet(pet);
                break;
        }

        }
        Console.println("Information has been Entered.Thank you!");

    }

}
