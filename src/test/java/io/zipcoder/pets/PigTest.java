package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
 * A test class for the goat class that should indicate to Michael Wolfe how to implement Pig.
 */
public class PigTest
{
    Pet goat;

    @Before
    public void setup()
    {
        goat = new Pig();
    }

    @Test
    public void speakTest()
    {
        String expected = "Oink";

        String actual = goat.speak();

        Assert.assertEquals(expected, actual);
    }
}
