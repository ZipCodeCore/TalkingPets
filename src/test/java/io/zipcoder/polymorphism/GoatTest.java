package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoatTest {
    Goat aGoat = new Goat("Billy");

    @Test
    public void speak() throws Exception {
        String expected = "Go Tee!";
        String actual = aGoat.speak();
        Assert.assertEquals(expected, actual);
    }

}