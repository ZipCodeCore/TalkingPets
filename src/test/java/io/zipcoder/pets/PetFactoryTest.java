package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
 */
public class PetFactoryTest
{
    CanCreatePets petFactory;

    @Before
    public void setup()
    {
        petFactory = new PetFactory();
    }

    @Test
    public void createDogTest()
    {
        Pet actual = petFactory.createPet("Dog");

        Assert.assertTrue(actual instanceof Dog);
    }

    @Test
    public void createCatTest()
    {
        Pet actual = petFactory.createPet("Cat");

        Assert.assertTrue(actual instanceof Cat);
    }

    @Test
    public void createPigTest()
    {
        Pet actual = petFactory.createPet("Pig");

        Assert.assertTrue(actual instanceof Pig);
    }

    @Test
    public void createNazgulTest()
    {
        Pet actual = petFactory.createPet("Nazgul");

        Assert.assertTrue(actual instanceof Dog);
    }
}
