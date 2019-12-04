package io.zipcoder.polymorphism.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    Cat testCat;

    @Test
    public void speak() {

        testCat = new Cat();

        String expected = "meow";
        String actual = testCat.speak();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testConstructorNoName() {

        testCat = new Cat();

        String expected = "No name cat";
        String actual = testCat.getName();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testConstructorWithName() {

        String expected = "Jiffy";
        testCat = new Cat(expected);
        String actual = testCat.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetType() {

        testCat = new Cat("Jiffy");

        String expected = "Cat";
        String actual = testCat.getPetType();

        Assert.assertEquals(expected, actual);
    }
}