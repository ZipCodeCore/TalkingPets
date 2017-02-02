package holland.andres;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andresholland on 1/31/17.
 */
public class PetTest {

    @Test
    public void speakTest () {
        Pet pet = new Pet("testPet");
        String expected = "hello";
        String actual = pet.speak();
        assertEquals(expected, actual);
    }

    @Test
    public void setGetNameTest () {
        Pet pet = new Pet("Stinky");
        String actual = pet.getName();
        String expected = "Stinky";
        assertEquals(expected, actual);
    }
}