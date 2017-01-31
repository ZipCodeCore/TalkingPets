package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author
 */
public class DisplayTest
{
    Display display;

    @Before
    public void setup()
    {
        display = new Display();
    }

    @Test
    public void promptForNumberOfPetsTest()
    {
        String expected = "How many pets do you have?:";

        String actual = display.promptForNumberOfPets();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void promptForTypeOfPetUserHas()
    {
        String expected = "What kind of animal is this pet?:";

        String actual = display.promptForTypeOfPet();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void promptForNameOfPetUserHas()
    {
        String expected = "What is the name of this pet?:";

        String actual = display.promptForNameOfPet();

        Assert.assertEquals(expected, actual);
    }
}
