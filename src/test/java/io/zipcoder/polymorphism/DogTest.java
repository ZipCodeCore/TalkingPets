package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    Dog dog = new Dog("", "Hikari");

    @Test

    public void speakTest(){
        String expected = "Woof";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

@Test

    public void setDog(){

       String expect = "Hikari";
       dog.setName("Hikari");
       String actual = dog.getName();
    }

}