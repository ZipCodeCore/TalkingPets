package io.zipcoder.pets;


import org.junit.Test;
import org.junit.Assert;


/**
 * Created by Timothy R Rager on 11/6/17.
 */
public class PetsTest {


    @Test
    public void testSetGetPetType(){
        Pet pet = new Pet();
        pet.setType("Snake");
        String expected="Snake";
        String actual=pet.getType();
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void testSetGetPetName(){

        Pet pet = new Pet();
        pet.setName("Nagini");
        String expected="Nagini";
        String actual=pet.getName();
        Assert.assertTrue(expected.equals(actual));

    }


}
