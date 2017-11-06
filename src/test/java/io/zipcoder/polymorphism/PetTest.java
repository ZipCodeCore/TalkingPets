package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void setGetName() throws Exception {
        String expected = "Brian";
        Pet myDog = new Dog("Brian");
        myDog.setName(expected);
        String actual = myDog.getName();
        Assert.assertEquals(expected, actual);
    }
}