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
    public void numOfPetsTest1() {
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Integer actual = MainApplication.getNumOfPets();
        Integer expected = 2;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void numOfPetsTest2() {
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Integer actual = MainApplication.getNumOfPets();
        Integer expected = 3;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void numOfPetsTest3() {
        String input = "8";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Integer actual = MainApplication.getNumOfPets();
        Integer expected = 8;
        Assert.assertEquals(expected, actual);
    }
}
