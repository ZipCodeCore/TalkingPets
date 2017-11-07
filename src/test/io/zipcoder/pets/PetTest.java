package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PetTest {
    Pet pet = new Pet("buck");
    Pet fred = new Dog("Fred");
    Pet mittens = new Cat("Mittens");


    @Test
    public void testConstructor(){
        String expected = "buck";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetName(){
        String expected = "barry";
        pet.setName("barry");
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak(){
        String expected = "some noise";
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testAddToPetArray(){
        pet.addToPetArray(mittens);
        String expected ="Mittens--Cat\n";
        String actual = pet.getPetsInArray();
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testAddToPetsNameArray(){
        String expected = "Mittens";
        mittens.addToPetsNameArray(expected);
        Assert.assertEquals(mittens.getPetsName(), expected);
    }

    @Test
    public void testGetPetsInArray(){
        pet.addToPetArray(fred);
        pet.addToPetArray(mittens);
        String expected = "Fred--Dog\nMittens--Cat\n";
        String actual = pet.getPetsInArray();
        Assert.assertEquals(expected, actual);
    }

}
