package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest extends Pet {

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