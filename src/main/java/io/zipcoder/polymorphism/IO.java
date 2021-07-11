package io.zipcoder.polymorphism;

import java.util.Scanner;

public class IO {

    public static Integer numberOfPets() {
        Scanner scanner = new Scanner(System.in);
        Integer userInitialInput = scanner.nextInt();
        return userInitialInput;
    }

    public static String namesOfPets() {
        Scanner scanner = new Scanner(System.in);
        String nameOfPet = scanner.next();
        return nameOfPet;
    }

    public static Integer chooseThePet() {
        Scanner scanner = new Scanner(System.in);
        Integer chooseYourPet = scanner.nextInt();
        return chooseYourPet;
    }
    public static Integer thePetsAge() {
        Scanner scanner = new Scanner(System.in);
        Integer chooseYourPet = scanner.nextInt();
        return chooseYourPet;
    }
}
