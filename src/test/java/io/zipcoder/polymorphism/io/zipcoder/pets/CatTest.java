package io.zipcoder.polymorphism.io.zipcoder.pets;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Pet;
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

        cat.setName("Garfield");
        String expected = "Garfield";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest(){
        Cat cat = new Cat();

        String expected = "Meow~";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
}
