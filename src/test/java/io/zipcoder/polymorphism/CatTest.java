package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void catConstructorTest(){
        //given
        String name = "Zazzy";

        //when
        Pet cat = new Cat(name);
        String actual = cat.getName();

        //then
        Assert.assertEquals(name, actual);
    }

    @Test
    public void catSpeakTest(){
        //given
        String name = "Zazzy";
        String expected = "Purrrr";

        //when
        Pet cat = new Cat(name);
        String sound = cat.speak();

        //then
        Assert.assertEquals(expected, sound);

    }
}
