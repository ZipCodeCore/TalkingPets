package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
 * A test class for the dog class that should indicate to Michael Wolfe how to implement Dog.
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
