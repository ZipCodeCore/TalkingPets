package io.zipcoder;

import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;



import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many dongs do you have: ");
        int numberOfPets = scan.nextInt();
        scan.nextLine();
        String petsName = "";

        ArrayList<Pet> petNameStringArray = new ArrayList<>();

        for (int i =1; i <= numberOfPets; i++){

            System.out.println("What kinds of pet is the " + i + " pet");
            String petType = scan.nextLine();
            System.out.println("What is the name of the pet? ");
            String petName = scan.nextLine();
            if (petType.equalsIgnoreCase("dog")) {
                Dog dogObj = new Dog(petName);
                petNameStringArray.add(dogObj);

            }

                else if (petType.equalsIgnoreCase("cat")) {
                petNameStringArray.add(new Cat(petName));

            }
            else if (petType.equalsIgnoreCase("bird")) {
                petNameStringArray.add(new Cat(petName));
            }
            else
                System.out.println("Please insert proper pet type");
            }

            for (Pet p: petNameStringArray) {
                System.out.print("The pet Name is " + p.getName()+ " and speaks ");
                p.speak();
        }



        }




}
