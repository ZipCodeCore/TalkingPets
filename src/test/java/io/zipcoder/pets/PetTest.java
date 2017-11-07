package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {
    Cat Raisin = new Cat("Raisin");

    @Test
    public void testSpeak()  {
        String expected = "meow.";
        String actual = Raisin.Speak();
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void setName()  {
        Pet name = new Pet("Jeff");
        String expected = "Jeff";
        String actual = name.setName();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getName()  {
        Pet name = new Pet("Sam");
        String expected = "Sam";
        String actual = name.getName();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void compareTo()  {

        int[] list1 = {1,2};
        int[] list2 = {1,2};

        Assert.assertArrayEquals(list1, list2);


    }

}