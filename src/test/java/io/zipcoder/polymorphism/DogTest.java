package io.zipcoder.polymorphism;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestDogConstructor(){

        String expectedName = "Frodo";
        String expectedType = "dog";
        Dog dog = new Dog(expectedName, expectedType);

        String actualName = dog.getPetName();
        String actualType = dog.getPetType();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void speak() {
        Dog dog = new Dog("Frodo", "dog");
        String expected = "Woof";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}