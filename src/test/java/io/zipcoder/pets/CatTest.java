package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    Cat newPet = new Cat("cat", "Whiskers");

    @Test
    public void testGetName() {
        String expected = "Whiskers";
        String actual = newPet.getName();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSpeak(){
        String expected="Meooooooow";
        String actual = newPet.speak();
        Assert.assertEquals(expected,actual);
    }
}
