package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    Pet pet = new Pet("buck");
    Dog fred = new Dog("Fred");

    @Test
    public void testConstructor(){
        String expected = "buck";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetName(){
        String expected = "barry";
        pet.setName("barry");
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak(){
        String expected = "woof";
        String actual = pet.Speak(expected);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void dogSpeakTest(){
        String expected = "woof";
        String actual = fred.Speak(expected);
        Assert.assertEquals(expected, actual);
    }

}
