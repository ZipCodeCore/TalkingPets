package io.zipcoder.pets;


import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    Pet newPet = new Pet("dog", "Max");

    @Test
    public void testGetName() {
        String expected = "Max";
        String actual = newPet.getName();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSpeak(){
        String expected=" ";
        String actual = newPet.speak();
        Assert.assertEquals(expected,actual);
    }
}
