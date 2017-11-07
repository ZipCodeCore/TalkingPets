package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DuckTest {

    boolean duckIsPet;
    Pet newPet = new Pet("Daffy");
    Duck Daffy = new Duck("Daffy");

    @Test
    public void testThePets() {
        if (newPet instanceof Pet) {
            duckIsPet = true;
        } else {
            duckIsPet = false;
        }
        Assert.assertTrue(duckIsPet);
    }

    @Test
    public void testDuckHasName (){
        String expected = "Daffy";
        String actual = newPet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDuckCanSpeak (){
        String expected = "quack";
        String actual = Daffy.Speak();
        Assert.assertEquals(expected, actual);
    }

}