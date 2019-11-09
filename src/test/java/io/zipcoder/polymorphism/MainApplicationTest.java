package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {
    @Test
    public void testGetNumberOfPets() {
        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Integer actual = MainApplication.getNumberOfPets();
        Integer expected = 4;
        Assert.assertEquals(expected, actual);
    }
}
