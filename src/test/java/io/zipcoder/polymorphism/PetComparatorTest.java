package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class PetComparatorTest {
    @Test
    public void testComparator() {

        ArrayList<Pet> petArrayListTest = new ArrayList<Pet>();


        Pet cat = new Cat();
        Pet parrot = new Parrot();
        Pet dog = new Dog();
        Pet cat2 = new Cat();


        cat.setName("fluffy");
        parrot.setName("polly");
        cat2.setName("whiskers");
        dog.setName("spot");

        petArrayListTest.add(cat2);
        petArrayListTest.add(cat);
        petArrayListTest.add(dog);
        petArrayListTest.add(parrot);

        String expected = " bark bark";
        String actual = "";

        Collections.sort(petArrayListTest, new PetComparator());



        for(int i = 0; i < petArrayListTest.size(); i++){
            actual += "My pets name is " + petArrayListTest.get(i).getName() + " and it goes " + petArrayListTest.get(i).speak() + "\n";
        }

        Assert.assertEquals(expected, actual);
    }


}