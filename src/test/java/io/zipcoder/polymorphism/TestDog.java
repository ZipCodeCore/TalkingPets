package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestDog {
    @Test
    public void dogConstructorTest() {
        //Given
        String given = "Spot";
        //When
        Dog dog = new Dog(given);
        String expected = dog.getName();
        //Then
        Assert.assertEquals(given, expected);
    }

    @Test
    public void speakTest() {
        //Given
        Dog dog = new Dog("Spot");
        String given = "Woof!";
        //When
        String expected = dog.speak();
        //Then
        Assert.assertEquals(given, expected);
    }

    @Test
    public void setNameTest() {
        // Given
        Dog dog = new Dog("");
        String given = "Spot";

        // When
        dog.setName(given);

        // Then
        String expected = dog.getName();
        Assert.assertEquals(given, expected);
    }

    @Test
    public void inheritanceOfPetTest() {

        Dog dog = new Dog("Spot");
        Assert.assertTrue(dog instanceof Pet);

    }

    @Test
    public void inheritanceOfAnimalTest() {

        Dog dog = new Dog("Spot");
        Assert.assertTrue(dog instanceof Animal);

    }
}

