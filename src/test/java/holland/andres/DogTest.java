package holland.andres;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andresholland on 1/31/17.
 */
public class DogTest {

    @Test
    public void speakTest () {
        Dog dog = new Dog("testDog");
        String expected = "guagua";
        String actual = dog.speak();
        assertEquals(expected, actual);
    }

}