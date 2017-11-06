package io.zipcoder.polymorphism;

import org.junit.Test;
import org.junit.Assert;

public class DogTest {

    @Test
    public void testDogSpeak(){
        Dog dog = new Dog();
        String expected = "Woof";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}
