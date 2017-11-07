package io.zipcoder.polymorphism;

import io.zipcoder.pets.*;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    Dog dog = new Dog();

    @Test
    public void catInstanceOfPetTest() {

        Assert.assertTrue(dog instanceof Pet);
    }

    @Test
    public void dogSetNameAndGetNameTest() {

        dog.setName("Aquiles");
        String expected = "Aquiles";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest() {

        String expected = "This dog bark...";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

}
