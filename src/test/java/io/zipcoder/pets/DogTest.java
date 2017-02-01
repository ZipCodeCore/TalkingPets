package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class DogTest {
    Dog dog;
    Dog dog2;
    @Before
    public void startUp(){
        dog = new Dog("rolf");
        dog2 = new Dog("pinky");
    }

    @Test
    public void speakTest(){
        String expected = "Woof Woof";
        String actual = dog.speak();
        assertEquals(expected, actual);
    }

    @Test
    public void compareToTest(){
        int actual = dog.compareTo(dog2);
        int expected = 1;
        assertEquals(expected, actual);

    }
}
