package io.zipcoder.polymorphism;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
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
        String name = "Garfield";
        Cat cat = new Cat(name);
        String expectedName = "Garfield";
        // When
        String actualName = cat.getName();
        // Then
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void dogSpeakTest() {
        // Given
        Cat cat = new Cat();
        String expected = "Meow!";
        // When
        String actual = cat.speak();
        // Then
        Assert.assertEquals(expected, actual);
    }
}

