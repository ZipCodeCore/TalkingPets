package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testSpeak() {
        Dog dog = new Dog("Tucker");
        String actual = dog.speak();
        String expected = "woof!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor1() {
        Dog dog = new Dog("Tucker");
        Assert.assertEquals("Tucker", dog.getName());
    }
    @Test
    public void testConstructor2() {
        Dog dog = new Dog("Tucker");
        Assert.assertEquals("dog", dog.getType());
    }
}
