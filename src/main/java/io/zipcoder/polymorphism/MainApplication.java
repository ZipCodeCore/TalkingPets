package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Scanner scanner=new Scanner(System.in);
        Scanner userInput=new Scanner(System.in);
        Console.print("How many pets do you have? ");
        Integer noOfPets=userInput.nextInt();
        Console.run(scanner,noOfPets);
    }
}
