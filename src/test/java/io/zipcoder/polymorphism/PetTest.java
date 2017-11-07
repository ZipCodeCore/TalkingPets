package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void setGetName() throws Exception {
        Cat aCat = new Cat();
        aCat.setName("A Name");
        String expected = "A Name";
        String actual = aCat.getName();
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testCompareTo(){
        Pet cat = new Cat();
        Pet parrot = new Parrot();

        cat.setName("fluffy");
        parrot.setName("polly");


        int petCompare = cat.compareTo(parrot);


        boolean actual = petCompare < 0;
        Assert.assertTrue(actual);
    }






}