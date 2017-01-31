package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
 */
public class DogTest
{
    Pet dog;

    @Before
    public void setup()
    {
        dog = new Dog();
    }

    @Test
    public void speakTest()
    {
        String expected = "Bork";

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
}
