package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    Bird polly = new Bird("polly");

    @Test
    public void testInheritance(){
        Assert.assertTrue(polly instanceof Pet);

    }

    @Test
    public void testSpeak(){
        String expected = "chirp chirp";
        String actual = polly.speak();
        Assert.assertEquals(expected, actual);
    }
}
