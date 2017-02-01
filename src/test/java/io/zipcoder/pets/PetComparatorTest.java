package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.Collator;
import java.text.RuleBasedCollator;
import java.util.Collections;

/**
 * Created by johnsquier on 2/1/17.
 */
public class PetComparatorTest
{
    PetComparator petComparator, petComparator2;
    Pet dog1, cat1, cat2;

    @Before
    public void setup()
    {
        petComparator = new PetComparator();
        petComparator2 = new PetComparator();

        dog1 = new Dog();
        dog1.setName("A");

        cat1 = new Cat();
        cat1.setName("B");

        cat2 = new Cat();
        cat2.setName("C");
    }

    @Test
    public void compareTestFirstPetTypeAlphabeticallyBeforeSecond()
    {
        int expected = -1;

        int actual = petComparator.compare(cat1, dog1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareTestFirstPetTypeAlphabeticallyAfterSecond()
    {
        int expected = 1;

        int actual = petComparator.compare(dog1, cat1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareTestPetTypesEqualFirstPetNameAlphabeticallyBeforeSecond()
    {
        int expected = -1;

        int actual = petComparator.compare(cat1, cat2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareTestPetTypesEqualFirstPetNameAlphabeticallyAfterSecond()
    {
        int expected = 1;

        int actual = petComparator.compare(cat2, cat1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareTestPetTypesEqualPetNamesEqual()
    {
        int expected = 0;

        int actual = petComparator.compare(cat1, cat1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void equalsTestComparatorsEqual()
    {
        Assert.assertTrue(petComparator.equals(petComparator2));
    }

    @Test
    public void equalsTestComparatorsNotEqual()
    {
        Assert.assertFalse(petComparator.equals(Collections.reverseOrder(petComparator)));
    }
}
