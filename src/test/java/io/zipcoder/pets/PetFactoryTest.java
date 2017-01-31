package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class PetFactoryTest {

    PetFactory petFactory;

    @Before
    public void setUp(){

        petFactory = new PetFactory("Dog", "Fido");
    }

    @Test
    public void makeAPetNameTest(){
        //Create a Pet reference
        Pet cat = petFactory.makeAPet("Cat", "Toonces");
        String expected = "Toonces";
        String actual = cat.getName();
        assertEquals("Expected Toonces", expected, actual);
    }

    @Test
    public void makeAPetTypeTest(){
        Pet dog = petFactory.makeAPet("Dog", "Fido");
        String expected = "Dog";
        String actual = dog.getClass().getSimpleName().toString();
        assertEquals("Expected Dog", expected, actual);
    }
}
