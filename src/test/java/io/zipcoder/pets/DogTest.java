package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void constructorTest() {
        //given
        String givenName = "Bruno";
        Integer givenId = 2;
        //when
        Dog dog = new Dog(givenName, givenId);
        String retrievedName = dog.getName();
        Integer retrievedId = dog.getId();
        //then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void testSetName() {
        //given
        String expectedName = "Issa";
        //when
        Dog dog = new Dog(expectedName,4);
        String actualName = dog.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testGetId() {
        //given
        Integer expectedId = 9;
        //when
        Dog dog = new Dog("Shigure", expectedId);
        Integer actualId = dog.getId();
        //then
        Assert.assertEquals(expectedId, actualId);

    }
    @Test
    public void testSpeak() {
        //given
        String expectedSpeak = "Bark!";
        //when
        Dog newDog = new Dog("Coco", 3);
        String actualSpeak = newDog.speak();
        //then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
    @Test
    public void testPetInheritance() {
        Dog newDog = new Dog("Kyo", 7);
        Assert.assertTrue(newDog instanceof Pet);
    }
}
