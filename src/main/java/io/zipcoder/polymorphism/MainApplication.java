package io.zipcoder.polymorphism;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {

        ArrayList<String> userInput = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.print("How many pets do you have: ");
        String numberOfPets = input.nextLine();
        userInput.add(numberOfPets);

        for (int i = 1; i <= Integer.valueOf(numberOfPets); i++){
            System.out.print("What type of pet is pet # " + i + ": ");
            userInput.add(input.nextLine());
            System.out.print("What is the name of pet # " + i) + ": ";
            userInput.add(input.nextLine());
        }

        System.out.println("Thank you.");
        System.out.println(Arrays.toString(userInput.toArray()));


    }



}


