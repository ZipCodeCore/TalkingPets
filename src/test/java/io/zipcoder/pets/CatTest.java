package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class CatTest {
    Cat cat = new Cat("Snowball");

    @Test
    public void speakTest() throws Exception {
        String expected = "meow";
        String actual = cat.speak();
        assertEquals("meow expected", expected, actual);
    }

}