package io.zipcoder.polymorphism;

import io.zipcoder.pets.*;
import org.junit.Assert;
import org.junit.Test;




public class CatTest {

    @Test
    public void catInstanceOfPetTest(){
        Cat cat = new Cat();

        Assert.assertTrue(cat instanceof Pet);
    }


    @Test
    public void catNameSetGetTest(){
        Cat cat = new Cat();

        cat.setName("Raul");
        String expected = "Raul";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest(){
        Cat cat = new Cat();

        String expected = "Bad cat";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
}

