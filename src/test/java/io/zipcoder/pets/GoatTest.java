package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/30/17.
 */
public class GoatTest
{
    Pet goat;

    @Before
    public void setup()
    {
        goat = new Goat();
    }

    @Test
    public void speakTest()
    {
        String expected = "I'm a goat!";

        String actual = goat.speak();

        Assert.assertEquals(expected, actual);
    }
}
