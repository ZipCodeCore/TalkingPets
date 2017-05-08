package io.zipcoder.Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by aaronlong on 5/1/17.
 */
public class App {

    public static Pet petIdentifier(String name, String specie) {
        Pet animal = null;
        if (specie.equals("dog")) animal = new Dog(name);
        else if (specie.equals("cat")) animal = new Cat(name);
        else if (specie.equals("bird")) animal = new Bird(name);
        else animal = new Pet(name, specie);
        return animal;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberOfPets = 0;
        double index = 0;
        ArrayList<String> list = new ArrayList<String>();
        while (scan.hasNext()) {
            if (numberOfPets == 0) {
                numberOfPets = scan.nextInt();
                System.out.println(numberOfPets);
            }
            if (index < .5) {
                System.out.println("Please list their name and what animal they are on a new like");
                System.out.println("Like this: Andre dog");
            }
            if (scan.hasNext()) {
                list.add(scan.next());
                index += .5;
            }
            if (index >= numberOfPets) break;
        }
        for (int i = 0; i < list.size(); i += 2) {
            String name = list.get(i);
            String specie = list.get(i + 1);
            Pet pet = petIdentifier(name, specie);
            System.out.println(String.format("%s: %s", pet.getName(), pet.speak()));
        }
    }
}
