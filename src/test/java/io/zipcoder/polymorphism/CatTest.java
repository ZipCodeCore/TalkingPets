package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void testSpeak() {

        Cat cat = new Cat();

        String expected = "meow!";
        String actual = cat.speak();


        Assert.assertEquals(expected, actual);
    }
}
