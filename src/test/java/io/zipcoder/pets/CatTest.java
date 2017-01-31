package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class CatTest {
    Cat cat;
    @Before
    public void startUp(){
        cat = new Cat("rolf");
    }

    @Test
    public void speakTest(){
        String expected = "Meow";
        String actual = cat.speak();
        assertEquals(expected, actual);
    }
}
