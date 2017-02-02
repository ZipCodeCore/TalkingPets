package holland.andres;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andresholland on 1/31/17.
 */
public class CatTest {

    @Test
    public void speakTest () {
        Cat cat = new Cat("testCat");
        String expected = "meow";
        String actual = cat.speak();
        assertEquals(expected, actual);
    }

}