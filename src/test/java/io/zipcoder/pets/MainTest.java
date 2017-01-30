package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/30/17.
 */
public class MainTest
{
    Main main;

    @Before
    public void setup()
    {
        main = new Main();
    }

    @Test
    public void promptForNumberOfPetsTest()
    {
        String expected = "How many pets do you have?:";

        String actual = main.promptForNumberOfPets();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void promptForTypeOfPetUserHas()
    {
        String expected = "What kind of animal is this pet?:";

        String actual = main.promptForTypeOfPetUserHas();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void promptForNameOfPetUserHas()
    {
        String expected = "What is the name of this pet?:";

        String actual = main.promptForNameOfPetUserHas();

        Assert.assertEquals(expected, actual);
    }
}
