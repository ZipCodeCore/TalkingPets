package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class PetTest {
    Pet pet = new Pet("Steve");

    @Test
    public void speakTest(){
        String expected = "I am pet";
        String actual = pet.speak();
        assertEquals("\'I am pet\' expected", expected, actual);

    }

    @Test
    public void getNameTest(){
        String expected = "Steve";
        String actual = pet.getName();
        assertEquals("Steve expected", expected, actual);
    }

}