package io.zipcoder.pets;

import io.zipcoder.polymorphism.Cat;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    Dog dog = new Dog("Hikari");

    @Test
    public void speakTest(){
        String expected = "Woof";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }


}