package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void dogConstructorTest() {
        Dog dog = new Dog("Tucker");
        String expectedName = "Tucker";
        String actualName = dog.getName();
        String expectedType = "dog";
        String actualType = dog.getType();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void catConstructorTest() {
        Cat cat = new Cat("Tom");
        String expectedName = "Tom";
        String actualName = cat.getName();
        String expectedType = "cat";
        String actualType = cat.getType();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void setNameTest() {
        Dog dog = new Dog("Tucker");
        dog.setName("Bill");
        String expected = "Bill";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        Dog dog = new Dog("Tucker");
        dog.speak();

    }
    @Test
    public void testSetType() {
        Dog dog = new Dog("Tucker");
        dog.setType("orange");
        String actual = dog.getType();
        String expected = "orange";
        Assert.assertEquals(expected, actual);
    }
}
