package io.zipcoder.polymorphism;

import io.zipcoder.pets.Cat;
import org.junit.Assert;
import org.junit.Test;

public class TestCat {
    @Test
    public void setNameTest() {
        // Given
        Cat cat = new Cat(null);
        cat.setName("Gerry");

        String expectedName = "Gerry";

        // When
        String actualName = cat.getName();

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
    public void catSpeakTest() {
        // Given

        // When

        // Then


    }
}
