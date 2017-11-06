package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class TestBird {
    @Test
    public void testGetName() {
        Pet pet = new Bird("bird", "A");
        String expected = "A";
        String actual = pet.getName();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSpeak(){
        Pet pet= new Bird("bird","B");
        String expexted= "Chirp";
        String actual= pet.speak();
        Assert.assertEquals(expexted,actual);
    }
}
