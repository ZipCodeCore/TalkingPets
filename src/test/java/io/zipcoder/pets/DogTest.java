package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class DogTest {

    Dog dog; //Create an instance of the Dog class

    @Before
    public void setup(){

        dog = new Dog("Fido");
    }

    @Test
    public void speakTest(){
        String expected = "Bow-wow";
        String actual = dog.speak();
        assertEquals("Expected Bow-wow", expected, actual);
    }
}
