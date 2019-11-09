package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    @Test
    public void testSpeak() {
        Bird bird = new Bird("Tucker");
        String actual = bird.speak();
        String expected = "chirp!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor1() {
        Bird bird = new Bird("Bort");
        Assert.assertEquals("Bort", bird.getName());
    }
    @Test
    public void testConstructor2() {
        Bird bird = new Bird("Tucker");
        Assert.assertEquals("bird", bird.getType());
    }
}
