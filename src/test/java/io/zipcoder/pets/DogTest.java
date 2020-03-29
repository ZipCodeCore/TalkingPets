package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest extends Pet {

    @Test
    public void inheritanceTest() {
        Dog TestDog = new Dog("dog", "Rex");
        Assert.assertTrue(TestDog instanceof Pet);
        Assert.assertTrue(TestDog instanceof Dog);
    }

    @Test
    public void testGetName() {
        Pet pet = new Dog("dog", "X");
        String expected = "X";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {
        Pet pet = new Dog("dog", "XX");
        String expected = "Ruff Ruff";
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);
    }
}