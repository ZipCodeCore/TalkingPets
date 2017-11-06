package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    Cat pumpkin = new Cat("pumpkin");

    @Test
    public void testInheritance(){
        Assert.assertTrue(pumpkin instanceof Pet);
    }

    @Test
    public void testSpeak(){
        String expected = "meow";
        String actual = pumpkin.speak();
        Assert.assertEquals(expected, actual);
    }
}
