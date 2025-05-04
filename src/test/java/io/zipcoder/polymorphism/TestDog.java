package io.zipcoder.polymorphism;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import org.junit.Assert;
import org.junit.Test;

public class TestDog {

    @Test
    public void setNameTest() {
        // Given
        Dog dog = new Dog(null);
        dog.setName("Mochi");

        String expectedName = "Mochi";

        // When
        String actualName = dog.getName();

        // Then
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void getNameTest() {
        // Given
        String name = "Mochi";
        Dog dog = new Dog(name);
        String expectedName = "Mochi";
        // When
        String actualName = dog.getName();
        // Then
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void dogSpeakTest() {
        // Given
        Dog dog = new Dog();
        String expected = "Woof!";
        // When
        String actual = dog.speak();
        // Then
        Assert.assertEquals(expected, actual);

    }

}
