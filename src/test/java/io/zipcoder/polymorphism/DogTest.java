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

    @Test
    public void compareToTest() {
        // Given
        Dog dog = new Dog("Bobby");
        Cat cat = new Cat("Tiger");

        // When
        Integer actual = dog.compareTo(cat);

        // Then
        Assert.assertTrue(actual<0);
    }

    @Test
    public void compareToByNameTest() {
        // Given
        Bird bird = new Bird("Bobby");
        Dog dog = new Dog("Bobby");

        // When
        Integer actual = dog.compareTo(bird);

        // Then
        Assert.assertTrue(actual>0);
    }

}
