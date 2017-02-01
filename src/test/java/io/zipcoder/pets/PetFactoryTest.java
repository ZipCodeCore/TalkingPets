package io.zipcoder.pets;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class PetFactoryTest {
    PetFactory petFactory;
    @Test
    public void makeAPetTest(){
        petFactory = new PetFactory();
        Pet dog = petFactory.makeAPet("Dog", "Reece");
        String expected = "Dog";
        String actual = dog.getClass().getSimpleName();
        assertEquals(expected, actual);
    }
}
