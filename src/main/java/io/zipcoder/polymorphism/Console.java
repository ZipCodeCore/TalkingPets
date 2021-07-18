package io.zipcoder.polymorphism;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Duck;
import io.zipcoder.pets.Pet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    private int numberOfPets;
    private List<Pet> storePets = new ArrayList<Pet>();

    public void enterNumber() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many pets do you have?\n Enter number: ");
        numberOfPets = userInput.nextInt();
        enterType();
    }

    public void enterType(){
        Scanner userInput = new Scanner(System.in);
        int petCounter = 0;
        int input;

        for(int i = 0; i < numberOfPets; i++) {
            System.out.println("Enter the type for pet #" + (petCounter+1));
            System.out.println("1: Cat\n2: Dog\n3: Duck");
            userInput = new Scanner(System.in);
            input = userInput.nextInt();
            switch (input) {
                case 1:
                    storePets.add(new Cat());
                    break;
                case 2:
                    storePets.add(new Dog());
                    break;
                case 3:
                    storePets.add(new Duck());
                    break;
                default:
                    System.out.println("invalid entry");
                    enterType();
                    break;
            }
            petCounter++;
        }
        enterName();
    }

    public void enterName() {
        Scanner userInput = new Scanner(System.in);
        String input;
        int storePetsIndex = 0;

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("Enter the name of pet #" + (storePetsIndex + 1));
            input = userInput.nextLine();
            storePets.get(storePetsIndex).setName(input);
            storePetsIndex++;
        }
        enterSpeak();
    }

    public void enterSpeak() {
        for (int i = 0; i < numberOfPets; i++) {
            System.out.println(storePets.get(i).getName() + " says " + storePets.get(i).speak());
        }
    }
}

//        String kindOfPet = "";
//        String nameOfPet = "";
//
//
//
//        for (int i = 0; i < numberOfPets; i++) {
//            System.out.println("List the type of pet and their name");
//            System.out.println("Enter type: ");
//            kindOfPet = userInput.next();
//            System.out.println("Enter name: ");
//            nameOfPet = userInput.next();
//        }
//        System.out.println("Kind of pets: \n" + kindOfPet);
//        System.out.println("Name of pets: \n" + nameOfPet);



