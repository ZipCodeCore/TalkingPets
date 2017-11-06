package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    Bird newPet = new Bird("bird", "Birdie");

    @Test
    public void testGetName() {
        String expected = "Birdie";
        String actual = newPet.getName();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSpeak(){
        String expected="Chirpppp";
        String actual = newPet.speak();
        Assert.assertEquals(expected,actual);
    }
}
