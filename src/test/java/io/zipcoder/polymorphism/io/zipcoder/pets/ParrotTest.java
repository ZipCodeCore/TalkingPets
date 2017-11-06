package io.zipcoder.polymorphism.io.zipcoder.pets;

import io.zipcoder.pets.Parrot;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {

    @Test
    public void parrotInstanceOfPetTest(){
        Parrot parrot = new Parrot();

        Assert.assertTrue(parrot instanceof Pet);
    }

    @Test
    public void parrotNameSetGetTest(){
        Parrot parrot = new Parrot();

        parrot.setName("Polly");
        String expected = "Polly";
        String actual = parrot.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parrotSpeakTest(){
        Parrot parrot = new Parrot();

        String expected = "Polly wanna cracker!";
        String actual = parrot.speak();

        Assert.assertEquals(expected, actual);
    }
}
