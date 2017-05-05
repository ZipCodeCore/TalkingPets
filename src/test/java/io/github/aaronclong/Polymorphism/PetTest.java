package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

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


    //Dog Tests
    @Test
    public void testDogSpeakMethod() {
        Dog dog = new Dog();
        Assert.assertEquals("Testing dog speak override", "I bark", dog.speak());
    }


    //Cat Tests
    @Test
    public void testCatSpeakMethod() {
        Cat cat = new Cat();
        Assert.assertEquals("Testing cat speak override", "I meow", cat.speak());
    }

    //Bird Tests
    @Test
    public void testBirdSpeakMethod() {
        Bird bird = new Bird();
        Assert.assertEquals("Testing cat speak override", "I sing", bird.speak());
    }
}