package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    Cat aCat = new Cat("Kitty");

    @Test
    public void speak() throws Exception {
        String expected = "Meow!";
        String actual = aCat.speak();
        Assert.assertEquals(expected, actual);
    }
}