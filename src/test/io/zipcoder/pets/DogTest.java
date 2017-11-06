package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    Dog fred = new Dog("fred");

    @Test
    public void testInheritance(){
        Assert.assertTrue(fred instanceof Pet);
    }

    @Test
    public void testSpeak(){
        String expected = "bark";
        String actual = fred.speak();
        Assert.assertEquals(expected, actual);
    }
}
