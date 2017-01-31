package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
 */
public class PetTest
{
    Pet dog;

    @Before
    public void setup()
    {
        // using dog since pet is abstract
        dog = new Dog();
        dog.setName("Dewey");
    }

    @Test
    public void getNameTest()
    {
        String expected = "Dewey";

        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest()
    {
        String expected = "Spanky";

        dog.setName("Spanky");
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }
}
