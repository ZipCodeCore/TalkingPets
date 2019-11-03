package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    public String name;
    @Test
    public void nameTest() {
        // Given
        Dog dog = new Dog("John");
        String expected = "John";

        // When
        String actual = dog.name();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given
        Dog dog = new Dog("John");
        String expected = "Woof Woof";

        // When
        String actual = dog.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
