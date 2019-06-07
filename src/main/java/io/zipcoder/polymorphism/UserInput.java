package io.zipcoder.polymorphism;

import java.util.Scanner;

public class UserInput {
    Scanner input = new Scanner(System.in);

    /* method to getNumberOfPets from user */
    public Integer getNumberOfPets() {
        int numberOfPets = 0;
        System.out.print("How many pets do you have: ");
        while (numberOfPets <= 0) {
            while (!input.hasNextInt()) {
                System.out.println("That's not a valid number!");
                input.next();
            }
            numberOfPets = input.nextInt();
            if (numberOfPets == 0) {
                System.out.println("That's too bad, pets are great!");
                break;
            } else if (numberOfPets < 0) {
                System.out.println("That's not a valid number!");
            }
        }
        System.out.println("Thanks.");
        return numberOfPets;
    }

    /* method to prompt for petType */
    public String getPetType(int i) {
        String petType = "";
        System.out.println("Is pet " + (i+1) + " a dog, cat, or bird ?");
        while ((!((petType.equals("dog")) || (petType.equals("cat")) || (petType.equals("bird")) ))) {
            petType = input.next().toLowerCase();
            if ((!((petType.equals("dog")) || (petType.equals("cat")) || (petType.equals("bird"))))) {
                System.out.println("That is not a valid pet type.");
                System.out.println("Is pet a dog, cat, or bird ?");
            }
        }
        return petType;
     }


    /* method to prompt for petName */
    public String getPetName() {
        System.out.print("Enter your pet's name:\n");
        String petName = input.next();
        return petName;
    }

}
