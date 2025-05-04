package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    @Test
    public void constructorTest() {
        //given
        String givenName = "Misty";
        Integer givenId = 3;
        //when
        Horse horse = new Horse(givenName, givenId);
        String retrievedName = horse.getName();
        Integer retrievedId = horse.getId();
        //then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void testSetName() {
        //given
        String expectedName = "Rin";
        //when
        Horse horse = new Horse(expectedName, 5);
        String actualName = horse.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testGetId() {
        //given
        Integer expectedId = 1;
        //when
        Horse horse = new Horse("Flash", expectedId);
        Integer actualId = horse.getId();
        //then
        Assert.assertEquals(expectedId, actualId);
    }
    @Test
    public void testSpeak() {
        //given
        String expectedSpeak = "Neigh!";
        //when
        Horse newHorse = new Horse("Layla", 2);
        String actualSpeak = newHorse.speak();
        //then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
    @Test
    public void testPetInheritance() {
        Horse newHorse = new Horse("Frank", 4);
        Assert.assertTrue(newHorse instanceof Pet);
    }

}
