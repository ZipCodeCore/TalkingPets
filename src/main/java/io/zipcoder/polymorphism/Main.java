package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main (String[] args) {
        Pet cat = new Cat("Brian");
        Pet dog = new Dog("Andrew");
        Pet goat = new Goat("Pavel");

        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(cat);
        pets.add(dog);
        pets.add(goat);

        Collections.sort(pets);

        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).getName());
        }
    }



}
