package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestDog {
    @Test
    public void testDogSpeak(){
        Dog dog = new Dog("Spike");
        String expected = "Woof!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}
