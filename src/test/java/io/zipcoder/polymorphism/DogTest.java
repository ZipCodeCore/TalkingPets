package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {


    @Test
    public void testSetDogName() {
        //given
        Dog dog = new Dog();
        String expectedName = "Rosie";
        //when
        dog.setName(expectedName);
        String actual = dog.getName();
        //then
        Assert.assertEquals(expectedName, actual);
    }

    @Test
    public void dogSpeakTest() {
        //given
        Dog dog = new Dog();
        //then
        String actual = dog.speak();
        //when
        Assert.assertEquals("Bark!", actual);
    }

}

