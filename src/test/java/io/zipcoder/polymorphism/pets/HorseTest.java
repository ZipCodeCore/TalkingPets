package io.zipcoder.polymorphism.pets;

import org.junit.Assert;
import org.junit.Test;

import javax.print.DocFlavor;

import static org.junit.Assert.*;

public class HorseTest {

    @Test
    public void speak() {

        Horse testHorse = new Horse();

        String expected = "Neigh";
        String actual = testHorse.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testConstructorNoName() {

        Horse testHorse = new Horse();

        String expected = "No name horse";
        String actual = testHorse.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testConstructorWithName() {

        String expected = "Billy";
        Horse testHorse = new Horse(expected);
        String actual = testHorse.getName();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testGetType() {

        Horse testHorse = new Horse("Billy");

        String expected = "Horse";
        String actual = testHorse.getPetType();

        Assert.assertEquals(expected, actual);
    }
}