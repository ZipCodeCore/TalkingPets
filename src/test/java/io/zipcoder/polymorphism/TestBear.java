package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestBear {
    @Test
    public void bearConstructorTest() {
        //Given
        String given = "Bubbles";
        //When
        Bear bear = new Bear(given);
        String expected = bear.getName();
        //Then
        Assert.assertEquals(given, expected);
    }

    @Test
    public void speakTest() {
        //Given
        Bear bear = new Bear("Bubbles");
        String given = "Roar!";
        //When
        String expected = bear.speak();
        //Then
        Assert.assertEquals(given, expected);
    }

    @Test
    public void setNameTest() {
        //Given
        Bear bear = new Bear("");
        String given = "Bubbles";

        //When
        bear.setName(given);

        //Then
        String expected = bear.getName();
        Assert.assertEquals(given, expected);
    }

    @Test
    public void inheritanceOfPetTest() {

        Bear bear = new Bear("Bubbles");
        Assert.assertTrue(bear instanceof Pet);

    }

    @Test
    public void inheritanceOfAnimalTest() {

        Bear bear = new Bear("Bubbles");
        Assert.assertTrue(bear instanceof Animal);

    }

}

