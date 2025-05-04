package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void dogConstructorTest(){
        //given
        String name = "JoJo";

        //when
        Pet dog = new Dog(name);
        String actual = dog.getName();

        //then
        Assert.assertEquals(name, actual);
    }

    @Test
    public void dogSpeakTest(){
        //given
        String name = "JoJo";
        String expected = "Woof woof!";

        //when
        Pet dog = new Dog(name);
        String sound = dog.speak();

        //then
        Assert.assertEquals(expected, sound);

    }
}
