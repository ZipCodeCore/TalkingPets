package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by tolaniibikunle on 1/31/17.
 */
public class Display {


    public int askUserForTheAmountOfPets(String questionToUser) {
        Scanner in = new Scanner(System.in);
        System.out.println(questionToUser);
        int userinput = in.nextInt();
        return userinput; // going to compare the user input into the for loop
    }

    public String askUserForThePetNameAndType(String questionToUser) {
        Scanner in = new Scanner(System.in);
        System.out.println(questionToUser);
        String userinput = in.nextLine();
        return userinput;
    }




    }

