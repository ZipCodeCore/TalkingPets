package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void testSetCatName() {
        //given
        Cat cat = new Cat();
        String expectedName = "Garfield";
        //when
        cat.setName(expectedName);
        String actual = cat.getName();
        //then
        Assert.assertEquals(expectedName, actual);
    }

    @Test
    public void catSpeakTest() {
        //given
        Cat cat = new Cat();
        //then
        String actual = cat.speak();
        //when
        Assert.assertEquals("Meow!", actual);
    }


}