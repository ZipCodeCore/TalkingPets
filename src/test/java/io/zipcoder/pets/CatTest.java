package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void constructorTest() {
        //given
        String givenName = "Banksy";
        Integer givenId = 0;
        //when
        Cat cat = new Cat(givenName, givenId);
        String retrievedName = cat.getName();
        Integer retrievedID = cat.getId();
        //then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenId, retrievedID);
    }
    @Test
    public void testGetName() {
        //given
        String expectedName = "Ony";
        //when
        Cat cat = new Cat(expectedName, 2);
        String actualName = cat.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testGetID() {
        //given
        Integer expectedId = 1;
        //when
        Cat cat = new Cat("Kyo", expectedId);
        Integer actualId = cat.getId();
        //then
        Assert.assertEquals(expectedId, actualId);
    }
    @Test
    public void testSpeak() {
        //given
        String expectedSpeak = "Meow!";
        //when
        Cat newCat = new Cat("Spooky", 1);
        String actualSpeak = newCat.speak();
        //then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
    @Test
    public void testPetInheritance() {
        Cat newCat = new Cat("Gojo", 2);
        Assert.assertTrue(newCat instanceof Pet);
    }
}
