package io.zipcoder.polymorphism.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speak() {
        Dog testDog = new Dog();
        String expected = "Woof";
        String actual = testDog.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testConstructorNoName() {
        Dog testDog = new Dog();
        String expected = "No name dog";
        String actual = testDog.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testConstructorWithName() {
        String expected = "Scully";
        Dog testDog = new Dog(expected);
        String actual = testDog.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetType() {

        Dog testDog = new Dog("Scully");

        String expected = "Dog";
        String actual = testDog.getPetType();

        Assert.assertEquals(expected, actual);
    }

}