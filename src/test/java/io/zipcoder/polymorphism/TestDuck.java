package io.zipcoder.polymorphism;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Duck;
import org.junit.Assert;
import org.junit.Test;

public class TestDuck {

    @Test
    public void setNameTest() {
        // Given
        Duck duck = new Duck(null);
        duck.setName("Loba");

        String expectedName = "Loba";

        // When
        String actualName = duck.getName();

        // Then
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void getNameTest() {
        // Given
        String name = "Macha";
        Duck duck = new Duck(name);
        String expectedName = "Macha";
        // When
        String actualName = duck.getName();
        // Then
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void dogSpeakTest() {
        // Given
        Duck duck = new Duck();
        String expected = "Quack!";
        // When
        String actual = duck.speak();
        // Then
        Assert.assertEquals(expected, actual);
    }
}