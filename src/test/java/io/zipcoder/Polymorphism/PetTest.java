package io.zipcoder.Polymorphism;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by aaronlong on 5/1/17.
 */
public class PetTest {

    private Pet pet;

    @Before
    public void setUp() {
        pet = new Pet();
    }

    @Test
    public void testName() {
        pet.setName("Riley");
        Assert.assertEquals("Confirm pet name getter and setter", "Riley", pet.getName());
    }

    @Test
    public void testSpeakMethod() {
        pet.setSpecie("dog");
        Assert.assertEquals("Testing speak method", "I am a dog", pet.speak());
    }

    @Test
    public void testGetSpecieMethod() {
        pet.setSpecie("Dog");
        Assert.assertEquals("Testing speak method", "dog", pet.getSpecie());
    }


    @Test
    public void testCompareTo() {

        Pet[] pets = new Pet[10];
        for (int i = 0; i < 10; i++) {
            String petName = String.format("YoMamma%s", i);

            System.out.println(i);
            if (i < 4) {
                pets[i] = new Pet(petName, "dog");
            } else if (i < 7) {
                pets[i]  = new Pet(petName, "cat");
            } else if (i < 10) {
                pets[i] = new Pet(petName, "bird");
            }

        }
        Arrays.sort(pets);
        System.out.println(pets);
        for(int i = 0; i < 10; i++){
            System.out.println(pets[i].getSpecie());
            if (i < 3){
               Pet petTester = pets[i];
               petTester.getSpecie();
               Assert.assertEquals("Checking if bird", "bird", pets[i].getSpecie());
            }
        }
    }

}