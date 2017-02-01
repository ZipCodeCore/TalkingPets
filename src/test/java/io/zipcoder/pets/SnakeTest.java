package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class SnakeTest {

//Create an instance of a Snake class
    Snake snake;

    @Before
    public void setUp(){
        snake = new Snake("Forest");
    }

    @Test
    public void speakTest(){
        String expected = "Hiss";
        String actual = snake.speak();
        assertEquals("Expected Hiss", expected, actual);
    }

    @Test
    public void compareToTest(){
        int expected = -1;
        int actual = snake.compareTo(snake);
        assertEquals("Expected to get -1", expected, actual);
    }
}
