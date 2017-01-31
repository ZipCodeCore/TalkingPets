package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
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
