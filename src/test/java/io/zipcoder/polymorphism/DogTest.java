package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speak() throws Exception {
        Dog aDog = new Dog("Spark");
        String expected = "Bark!";
        String actual = aDog.speak();
        Assert.assertEquals(expected, actual);
    }

}