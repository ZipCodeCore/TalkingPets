package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class CatTest {

    Cat cat; //Create an instance of the Cat class

    @Before
    public void setUp(){

        cat = new Cat("Tiddles");
    }

    @Test //Test initially with the simple stub speak method in Cat that returns null
    public void speakTest(){
        String expected = "Meow";
        String actual = cat.speak();
        assertEquals("Expected Meow", expected, actual);
    }
}
