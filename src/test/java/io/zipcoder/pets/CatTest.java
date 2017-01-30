package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/30/17.
 */
public class CatTest
{
    Pet cat;

    @Before
    public void setup()
    {
        cat = new Cat();
    }

    @Test
    public void speakTest()
    {
        String expected = "Meow!";

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
}
