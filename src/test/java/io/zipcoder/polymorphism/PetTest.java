package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

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

}