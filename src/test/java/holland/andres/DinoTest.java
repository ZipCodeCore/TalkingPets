package holland.andres;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andresholland on 1/31/17.
 */
public class DinoTest {

    @Test
    public void speakTest () {
        Dino dino = new Dino("testDino");
        String expected = "roar";
        String actual = dino.speak();
        assertEquals(expected, actual);
    }

}