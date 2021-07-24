package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Console {

    public static void print(String output, Object... args){
        System.out.printf(output, args);
    }
    public static void println(String output, Object... args){
        print(output + "\n", args);
    }
    public static String getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int userInput = Integer.parseInt(scanner.nextLine());
        return userInput;
    }
}
