package io.zipcoder.polymorphism;

import io.zipcoder.pets.Bear;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class BearTest {
    @Test
    public void bearInstanceOfTest(){
        Bear bear= new Bear("Ay");
        Assert.assertTrue(bear instanceof Pet);
    }
    @Test
    public void bearGetNameTest(){
        Bear bear= new Bear("Ay");
        String actual = bear.getName();

        Assert.assertEquals("Ay",actual);
    }

    @Test
    public void bearSetNameTest(){
        Bear bear= new Bear("Ay");
        bear.setName("Bee");
        String actual = bear.getName();

        Assert.assertEquals("Bee",actual);
    }
    @Test
    public void bearSpeakTest(){
        Bear bear= new Bear("Ay");
        String actual = bear.speak();
        Assert.assertEquals("*chews Human*",actual);
    }
}


