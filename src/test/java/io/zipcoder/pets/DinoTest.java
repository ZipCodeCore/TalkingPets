package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class DinoTest {
    Dino dino = new Dino("Raptor");

    @Test
    public void speakTest(){
        String expected = "XD RAWR";
        String actual = dino.speak();
        assertEquals("XD RAWR expected", expected, actual);
    }

}