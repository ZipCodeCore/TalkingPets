package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
 */
public class PigTest
{
    Pet pig;

    @Before
    public void setup()
    {
        pig = new Pig();
    }

    @Test
    public void speakTest()
    {
        String expected = "Oink";

        String actual = pig.speak();

        Assert.assertEquals(expected, actual);
    }
}
