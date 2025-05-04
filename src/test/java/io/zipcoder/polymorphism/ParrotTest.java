package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {

    @Test
    public void parrotConstructorTest(){
        //given
        String name = "Jared";

        //when
        Pet parrot = new Parrot(name);
        String actual = parrot.getName();

        //then
        Assert.assertEquals(name, actual);
    }

    @Test
    public void parrotSpeakTest(){
        //given
        String name = "Zazzy";
        String expected = "I do what I want";

        //when
        Pet parrot = new Parrot(name);
        String sound = parrot.speak();

        //then
        Assert.assertEquals(expected, sound);

    }
}
