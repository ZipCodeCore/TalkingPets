package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
 * This class tests the pets superclass that MaWolfe87 will write.
 */
public class PetsTest
{
    Pet pet;

    @Before
    public void setup()
    {
        pet = new Pet();
    }

    @Test
    public void getNumberOfPetsUserHasTest()
    {
        int actual = pet.getNumberOfPetsUserHas();

        Assert.assertTrue(actual >= 0);
    }

    @Test
    public void getTypeOfPetUserHasTest()
    {
        String actual = pet.getTypeOfPetUserHas();

        Assert.assertTrue(actual != null);
    }
}
