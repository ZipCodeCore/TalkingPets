package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PetTest {
    Pet pet = new Pet("buck");
    Pet fred = new Dog("Fred");
    Pet mittens = new Cat("Mittens");
    Pet fred2 = new Bird("Fred");


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
        String expected ="Mittens the Cat goes meow\n";
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
        String expected = "Fred the Dog goes bark\n" +
                "Mittens the Cat goes meow\n";
        String actual = pet.getPetsInArray();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareToDifferentNames(){
        int expected = 7;
        int actual = mittens.compareTo(fred);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareToSameName(){
        int expected = -2;
        int actual = fred2.compareTo(fred);
        Assert.assertEquals(expected, actual);
    }

}
