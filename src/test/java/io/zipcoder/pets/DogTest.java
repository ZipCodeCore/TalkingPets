package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class DogTest {
    Dog dog;
    @Before
    public void startUp(){
        dog = new Dog("rolf");
    }

    @Test
    public void speakTest(){
        String expected = "Woof Woof";
        String actual = dog.speak();
        assertEquals(expected, actual);
    }
}
