package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testSpeak() {
        Cat cat = new Cat("Charlie");
        String actual = cat.speak();
        String expected = "meow!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor1() {
        Cat cat = new Cat("Charlie");
        Assert.assertEquals("Charlie", cat.getName());
    }
    @Test
    public void testConstructor2() {
        Cat cat = new Cat("Charlie");
        Assert.assertEquals("cat", cat.getType());
    }
}
