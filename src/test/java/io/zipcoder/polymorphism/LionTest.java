package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class LionTest extends TestCase {

    @Test
    public void testSpeak(){
        //Give
        Lion lion = new Lion("Im Lion Benny");
        //When
        String expected = "Rawr";
        String actual = lion.speak();
        //Then
        Assert.assertEquals(expected,actual);

    }

}