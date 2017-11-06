package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class SnakeTest {

    Snake snake = new Snake("Snake", "Minamoto");

    @Test
    public void speakTest() {
        String expected = "Parseltongue";
        String actual = snake.speak();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setSnake(){


        String expected = "Minamoto";
        snake.setName("Minamoto");

        String actual = snake.getName();
    }
}