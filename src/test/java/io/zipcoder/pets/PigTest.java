package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
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
