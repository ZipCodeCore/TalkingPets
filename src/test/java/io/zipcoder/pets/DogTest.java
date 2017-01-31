package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class DogTest {
    Dog dog = new Dog("Fido");

    @Test
    public void speakTest(){
        String expected = "woof";
        String actual = dog.speak();
        assertEquals("woof expected", expected, actual);
    }

}