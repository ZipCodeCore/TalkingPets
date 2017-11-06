package io.zipcoder.pets;

import org.junit.Test;
import org.junit.Assert;

public class TestPet {
    @Test
    public void testGetName() {
        Pet pet = new Pet("dog", "A");
        String expected = "A";
        String actual = pet.getName();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSpeak(){
        Pet pet= new Pet("cat","B");
        String expected= "Pet speaking from Super";
        String actual= pet.speak();
        Assert.assertEquals(expected,actual);
    }
}
