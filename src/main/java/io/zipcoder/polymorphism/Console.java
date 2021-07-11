package io.zipcoder.polymorphism;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Horse;
import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    private static List<Pet> petList = new ArrayList<>();
    private static Integer count;

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello pet owner! How many pets do you have?");
        //count = getIntegerInput("Hello pet owner! How many pets do you have?");
        count = scanner.nextInt();
        int I = 0;
        while (I < count){
            System.out.println("What type of pet is your pet # " + (I +1) + " ?\n" +
                    "1.Dog, 2. Cat, 3. Horse");
            int input = scanner.nextInt();
//            Integer input = getIntegerInput("What type of pet is your pet # " + I + " ?\n" +
//                    "1.Dog, 2. Cat, 3. Horse");
            switch(input) {
                case 1 :
                    petList.add(new Dog());
                    break;
                case 2 :
                    petList.add(new Cat());
                    break;
                case 3 :
                    petList.add(new Horse());
                    break;
                default :
                    System.out.println("Error! Pick 1, 2 or 3");
                    continue;
            }
            I++;
        }

    }

    public static void getNames(){
        Scanner scanner = new Scanner(System.in);
        String input;
        int I = 0;
        while (I < count){
            System.out.println("What is the name of your pet #" + (I + 1) + " who is a " + petList.get(I).getClass().getSimpleName() + "?" );
            input = scanner.nextLine();
            petList.get(I).setName(input);
            I++;
        }
    }
    public static void speak(){
        System.out.println("You have " + count + " pets.");
        for(Pet eachPet: petList){
            System.out.println(eachPet.getName() + " the " + eachPet.getClass().getSimpleName() + " says " + eachPet.speak());
        }
    }

    public static void print(String output, Object...args){
        System.out.printf(output, args);
    }

    public static void println(String output, Object...args){
        print(output + "\n" + args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextLine();
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    public static Float getFloatInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(String.valueOf(prompt));
        return Float.parseFloat((scanner.nextLine()));
    }


}
