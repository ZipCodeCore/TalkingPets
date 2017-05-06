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
    public void testCompareToAgainstType() {
        Pet[] pets = new Pet[10];
        for (int i = 0; i < 10; i++) {
            String petName = String.format("YoMamma%s", i);
            if (i < 3) {
                pets[i] = new Pet(petName, "dog");
            } else if (i < 6) {
                pets[i]  = new Pet(petName, "cat");
            } else if (i < 10) {
                pets[i] = new Pet(petName, "bird");
            }
        }
        Arrays.sort(pets);
        for(int i = 0; i < 10; i++){
            if (i < 4){
               Assert.assertEquals("Checking if bird", "bird", pets[i].getSpecie());
            }
            else if (i < 7) {
                Assert.assertEquals("Checking if cat", "cat", pets[i].getSpecie());
            }
            else if (i < 10) {
                Assert.assertEquals("Checking if dog", "dog", pets[i].getSpecie());
            }
        }
    }


    @Test
    public void testCompareToAgainstName() {
        Pet[] pets = { new Pet("Miley", "dog"),
                       new Pet("Andre", "dog"),
                       new Pet("Bailey", "dog"),
                       new Pet("Gail", "dog") };
        Arrays.sort(pets);
        for (int i = 0; i < pets.length; i++) {
            if (i == 0) Assert.assertEquals("Andre", pets[i].getName());
            else if (i == 1) Assert.assertEquals("Bailey", pets[i].getName());
            else if (i == 2) Assert.assertEquals("Gail", pets[i].getName());
            else if (i == 3) Assert.assertEquals("Miley", pets[i].getName());
        }
    }

}