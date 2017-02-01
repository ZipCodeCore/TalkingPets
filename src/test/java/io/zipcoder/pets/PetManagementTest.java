package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alexandraarmstrong on 2/1/17.
 */
public class PetManagementTest {
    Pet cat;
    Pet dog;
    PetManagement petManagement;

    @Before
    public void setUp(){
        petManagement = new PetManagement();
        cat = new Cat("Arline");
        dog = new Dog("Jimmy");
    }

    @Test
    public void compareTest(){
        int actual = petManagement.compare(cat, dog);
        int expected = 1;
        assertEquals(expected, actual);
    }
}
