package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class FoxTest {
    Fox fox;
    Fox fox2;

    @Before
    public void startUp(){
        fox = new Fox("rolf");
        fox2 = new Fox("pinky");
    }

    @Test
    public void speakTest(){
        String actual = fox.speak();
        assertTrue(actual.equals("Gering-ding-ding-ding-dingeringeding!")
                || actual.equals("Wa-pa-pa-pa-pa-pa-pow!")
                || actual.equals("Hatee-hatee-hatee-ho!")
                || actual.equals("Joff-tchoff-tchoffo-tchoffo-tchoff!"));

    }

    @Test
    public void compareToTest(){
        int actual = fox.compareTo(fox2);
        int expected = 1;
        assertEquals(expected, actual);

    }

}
