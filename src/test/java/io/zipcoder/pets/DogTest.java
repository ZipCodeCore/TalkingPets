package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    Dog newPet = new Dog("dog", "Max");

    @Test
    public void testGetName() {
        String expected = "Max";
        String actual = newPet.getName();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSpeak(){
        String expected="Wooooof";
        String actual = newPet.speak();
        Assert.assertEquals(expected,actual);
    }
}
