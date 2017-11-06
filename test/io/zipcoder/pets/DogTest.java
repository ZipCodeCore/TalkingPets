package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void setNameTest(){
        Dog dog = new Dog();
        String expected = "Maude";

        dog.setName("Maude");
        String actual = dog.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNameTest(){
        Dog dog = new Dog("Buddy");

        String expected = "Buddy";
        String actual = dog.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Dog dog = new Dog();

        String expected = "Ruff.";

        String actual = dog.speak();

        Assert.assertEquals(expected,actual);

    }

}