package io.zipcoder.polymorphism;

import io.zipcoder.pets.*;
import org.junit.Assert;
import org.junit.Test;


public class LionTest {
    Lion lion = new Lion();

    @Test
    public void lionInstanceOfPetTest() {

        Assert.assertTrue(lion instanceof Pet);
    }

    @Test
    public void lionNameSetGetTest(){

        lion.setName("Gaby");
        String expected = "Gaby";
        String actual = lion.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest(){

        String expected = "This lion will definitely bite you... ";
        String actual = lion.speak();

        Assert.assertEquals(expected, actual);
    }
}
