package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class SnakeTest {
    @Test
    public void testSpeak() {
        Snake snake = new Snake("Lamar");
        String actual = snake.speak();
        String expected = "slither!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor1() {
        Snake snake = new Snake("Artie");
        Assert.assertEquals("Artie", snake.getName());
    }
    @Test
    public void testConstructor2() {
        Snake snake = new Snake("Tucker");
        Assert.assertEquals("snake", snake.getType());
    }
}
