package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class PetsTest {

    @Test
    public void testGetName() {

       String name = "Justin";
       Pets pet = new Pets(name);
       String expected = pet.getName();
       String actual = name;
       Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetName2() {


        Pets pet = new Pets("Justin");
        String expected = pet.getName();
        String actual = "Frank";
        Assert.assertNotEquals(expected, actual);

    }







}