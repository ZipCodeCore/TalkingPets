package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void nameTest() {
        // Given
        Cat cat = new Cat("Val");
        String expected = "Val";

        // When
        String actual = cat.name();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given
        Cat cat = new Cat("Valerie");
        String expected = "Meow";

        // When
        String actual = cat.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareToTest() {
        // Given
        Cat cat = new Cat("Tiger");
        Dog dog = new Dog("Bobby");

        // When
        Integer actual = cat.compareTo(dog);

        // Then
        Assert.assertTrue(actual>0);
    }

    @Test
    public void compareToByNameTest() {
        // Given
        Cat cat = new Cat("Tiger");
        Dog dog = new Dog("Tiger");

        // When
        Integer actual = cat.compareTo(dog);

        // Then
        Assert.assertTrue(actual<0);
    }

}
