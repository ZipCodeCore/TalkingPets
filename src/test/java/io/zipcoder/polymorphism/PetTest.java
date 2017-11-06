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

    @Test
    public void compareToTest_Name() throws Exception {
        Pet dogOne = new Dog("billy");
        Pet dogTwo = new Dog("johnny");

        int expected = -8;
        int actual = dogOne.compareTo(dogTwo);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void compareToTest_Type() throws Exception {
        Pet aDog = new Dog("billy");
        Pet aCat = new Cat("billy");

        int expected = 1;
        int actual = aDog.compareTo(aCat);
        Assert.assertEquals(expected, actual);

    }
}