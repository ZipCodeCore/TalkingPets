package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {
    public String name;

    @Test
    public void setGetName() throws Exception {
        String expected = "Andrew";
        Pet myDog = new Dog("Spark");
        myDog.setName(expected);
        String actual = myDog.getName();
        Assert.assertEquals(expected, actual);
    }
}