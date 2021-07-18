package io.zipcoder.polymorphism;


import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class TestPet {

    @Test
    public void setNameTest() {
        // Given
        Pet pet = new Pet(null);
        pet.setName("Peter");

        String expectedName = "Peter";
        // When
        String actualName = pet.getName();

        // Then
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void getNameTest() {
        // Given
        String name = "Peter";
        Pet pet = new Pet(name);
        String expectedName = "Peter";
        // When
        String actualName = pet.getName();
        // Then
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void speakTest() {
        // Given
        Pet pet = new Pet();
        String expected = "Pet say word";
        // When
        String actual = pet.speak();
        // Then
        Assert.assertEquals(expected, actual);

    }
}
