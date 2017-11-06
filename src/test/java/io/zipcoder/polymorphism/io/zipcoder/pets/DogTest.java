package io.zipcoder.polymorphism.io.zipcoder.pets;

import io.zipcoder.pets.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {

    Pet pet;
    String name = "Rover";
    String call = "Bark bark!";

    @Before
    public void setUp(){
        pet = new Dog();
    }

    //change the setup to match pet copy pasta the actual tests

    @Test
    public void thisPetInstanceOfPetTest(){
        Assert.assertTrue(pet instanceof Pet);
    }

    @Test
    public void petNameSetGetTest(){
        pet.setName(name);
        String expected = name;
        String actual = pet.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petSpeakTest(){
        String expected = call;
        String actual = pet.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petToString(){
        pet.setName(name);

        String expected = "This pet is a "+pet.getClass().getSimpleName()+" named "+name+", who goes "+call;
        String actual = pet.toString();

        Assert.assertEquals(expected, actual);
    }
}
