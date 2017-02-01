package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class CatTest {
    Cat cat;
    Cat cat2;
    @Before
    public void startUp(){
        cat = new Cat("rolf");
        cat2 = new Cat("pinky");
    }

    @Test
    public void speakTest(){
        String expected = "Meow";
        String actual = cat.speak();
        assertEquals(expected, actual);
    }

    @Test
    public void compareToTest(){
        int actual = cat.compareTo(cat2);
        int expected = 1;
        assertEquals(expected, actual);

    }
}
