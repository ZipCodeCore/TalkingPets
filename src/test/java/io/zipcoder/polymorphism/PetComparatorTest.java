package io.zipcoder.polymorphism;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PetComparatorTest {

    @Test
    public void testCompare(){
        ArrayList<Pet> petTest = new ArrayList<>();

        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet parrot = new Parrot();

        dog.setName("Riki");
        cat.setName("Mimi");
        parrot.setName("Para");

        petTest.add(dog);
        petTest.add(cat);
        petTest.add(parrot);

        String expected = "bark";
        String actual = "";

        Collections.sort(petTest, new PetComparator());
        for(int i = 0; i < petTest.size(); i++) {
            actual += petTest.get(i).getName() + petTest.get(i).speak();
        }
    }
}
