package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Console {
    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n",args);
    }

    public static String getStringInput(String prompt) {
        Scanner in = new Scanner(System.in);
        print(prompt);
        String userInput = in.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        Boolean check = false;
        do {
            print(prompt);
            userInput = scanner.nextLine();
            check = userInput.matches("^\\d{0,9}$");
            if (!check) println("Error: please enter a valid number");
        } while (!check);

        return Integer.valueOf(userInput);
    }
}
