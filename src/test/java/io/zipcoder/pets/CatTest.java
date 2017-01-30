package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
 * A test class for the cat class that should indicate to Michael Wolfe how to implement Cat.
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
