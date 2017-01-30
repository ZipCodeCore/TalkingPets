package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
 * This class tests the pets superclass that MaWolfe87 will write.
 */
public class PetTest
{
    Pet pet;

    @Before
    public void setup()
    {
        pet = new Pet();
        pet.setName("Petty Pet");
    }

    @Test
    public void getNameTest()
    {
        String expected = "Petty Pet";

        String actual = pet.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest()
    {
        String expected = "Achy Animal";

        pet.setName("Achy Animal");
        String actual = pet.getName();

        Assert.assertEquals(expected, actual);
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

    @Test
    public void getNameOfPetUserHasTest()
    {
        String actual = pet.getNameOfPetUserHas();

        Assert.assertTrue(actual != null);
    }

    @Test
    public void generateListOfPetsAsString()
    {
        String actual = pet.generateListOfPetsAsString();

        Assert.assertTrue(actual != null);
    }
}
