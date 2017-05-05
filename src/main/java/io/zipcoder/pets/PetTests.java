package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class PetTests {

    @Test
    public void dogSpeakTest() {
        //Given
        Pet dog = new Dog();
        String expected = "Doggie says woof woof";
        //When
        String actual = "Doggie says " + dog.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest() {
        //Given
        Pet cat = new Cat();
        String expected = "Cat says meow";
        //When
        String actual = "Cat says " + cat.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void goldishSpeakTest() {
        //Given
        Pet goldfish = new Goldfish();
        String expected = "Goldfish says glub glub";
        //When
        String actual = "Goldfish says " + goldfish.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
