package io.zipcoder.polymorphism;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestCatConstructor() {
        String expectedName = "Bilbo";
        String expectedType = "cat";

        Cat cat = new Cat(expectedName, expectedType);

        String actualName = cat.getPetName();
        String actualType = cat.getPetType();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void speak() {
        Cat cat = new Cat("Bilbo", "cat");
        String expected = "Meow";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
}
