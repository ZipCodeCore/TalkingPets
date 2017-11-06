package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void setNameTest(){
        Cat cat = new Cat();
        String expected = "Jerry";

        cat.setName("Jerry");
        String actual = cat.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNameTest(){
        Cat cat = new Cat("Todd");

        String expected = "Todd";
        String actual = cat.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Cat cat = new Cat();

        String expected = "Rawr.";

        String actual = cat.speak();

        Assert.assertEquals(expected,actual);

    }

}