package io.zipcoder.polymorphism;

import io.zipcoder.pets.Cat;
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

        // When

        // Then


    }

    @Test
    public void duckSpeakTest() {
        // Given

        // When

        // Then


    }
}
