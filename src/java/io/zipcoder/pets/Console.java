package io.zipcoder.pets;

import java.util.Scanner;

public class Console {
     static Scanner scanner = new Scanner(System.in);

    public static String getStringInput(String askForString){
        System.out.println(askForString);
        String userInput = new Scanner(System.in).nextLine();
        return userInput;

    }

    public static int getIntInput(String askForInt){
        return Integer.parseInt(getStringInput(askForInt));
    }


}
