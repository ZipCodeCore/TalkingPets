package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.rmi.MarshalException;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void getNameTest(){
        Pet pet = new Pet();
        String expected = "Russel";

        pet.setName("Russel");
        String actual = pet.getName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setNameTest(){
        Pet pet = new Pet();
        String expected = "Marlowe";

        pet.setName("Joe");
        pet.setName("Marlowe");

        String actual = "Marlowe";

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void speakTest(){
        Pet pet = new Pet();

        String expected = "I'm not your 'buddy,' pal.";
        String actual = pet.speak();

        Assert.assertEquals(expected,actual);

    }
}