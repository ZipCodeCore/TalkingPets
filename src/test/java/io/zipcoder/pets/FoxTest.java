package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class FoxTest {
    Fox fox;
    @Before
    public void startUp(){
        fox = new Fox("rolf");
    }

    @Test
    public void speakTest(){
        String actual = fox.speak();
        assertTrue(actual.equals("Gering-ding-ding-ding-dingeringeding!")
                || actual.equals("Wa-pa-pa-pa-pa-pa-pow!")
                || actual.equals("Hatee-hatee-hatee-ho!")
                || actual.equals("Joff-tchoff-tchoffo-tchoffo-tchoff!"));

    }
}
