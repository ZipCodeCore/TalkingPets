package io.zipcoder.polymorphism;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void catInstanceOfTest(){
        Cat cat= new Cat("Ay");
        Assert.assertTrue(cat instanceof Pet);
    }
    @Test
    public void catGetNameTest(){
        Cat cat= new Cat("Ay");
        String actual = cat.getName();

        Assert.assertEquals("Ay",actual);
    }

    @Test
    public void catSetNameTest(){
        Cat cat= new Cat("Ay");
        cat.setName("Bee");
        String actual = cat.getName();

        Assert.assertEquals("Bee",actual);
    }
    @Test
    public void catSpeakTest(){
        Cat cat= new Cat("Ay");
        String actual = cat.speak();
        Assert.assertEquals("Meow!",actual);
    }
}


