package io.zipcoder.polymorphism;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurtleTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestTurtleConstructor(){



        String expectedName = "Gretchen";
        String expectedType = "turtle";
        Turtle turtle = new Turtle(expectedName, expectedType);
        String actualName = turtle.getPetName();
        String actualType = turtle.getPetType();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void speak() {
        Turtle turtle = new Turtle("Gretchen", "turtle");
        String expected = "Meowf";
        String actual = turtle.speak();
        Assert.assertEquals(expected, actual);
    }
}