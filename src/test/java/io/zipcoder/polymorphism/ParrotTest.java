package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {

    @Test
    public void parrotTest(){
        Parrot parrot = new Parrot();
        String expected = "Squawk!";
        String actual = parrot.speak();
        Assert.assertEquals(actual, expected);
    }
}
