package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author John A. Squier
 */
public class PetTest
{
    Pet dog, dog2, cat, cat2, pig, pig2;
    List<Pet> expected, actual;

    @Before
    public void setup()
    {
        // using dog since pet is abstract
        dog = new Dog();
        dog2 = new Dog();
        cat = new Cat();
        cat2 = new Cat();
        pig = new Pig();
        pig2 = new Pig();

        dog.setName("Dewey");
        dog2.setName("Abba");
        cat.setName("Bubba");
        cat2.setName("Charlie");
        pig.setName("Charlie");
        pig2.setName("Charlie");

        expected = new ArrayList<>();
        actual = new ArrayList<>();
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

    @Test
    public void comparePetsFirstAlphabeticallyBeforeSecond()
    {

        expected.add(dog2);
        expected.add(cat);

        actual.add(cat);
        actual.add(dog2);

        Collections.sort(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void comparePetsFirstAlphabeticallyAfterSecond()
    {
        expected.add(cat);
        expected.add(cat2);

        actual.add(cat);
        actual.add(cat2);

        Collections.sort(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void comparePetsWithSameNamesFirstTypeNameAlphabeticallyBeforeSecond()
    {
        expected.add(cat2);
        expected.add(pig);

        actual.add(cat2);
        actual.add(pig);

        Collections.sort(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void comparePetsWithSameNameFirstTypeNameAlphabeticallyAfterSecond()
    {
        expected.add(cat2);
        expected.add(pig);

        actual.add(pig);
        actual.add(cat2);

        Collections.sort(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void comparePetsWithSameNamesThisTypeNameTheSameAsOther()
    {
        expected.add(pig);
        expected.add(pig2);

        // stable if everything is the same
        actual.add(pig);
        actual.add(pig2);

        Collections.sort(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortListOfPets()
    {
        expected.add(dog2);
        expected.add(cat);
        expected.add(cat2);
        expected.add(pig);
        expected.add(pig2);
        expected.add(dog);

        actual.add(pig);
        actual.add(pig2);
        actual.add(cat);
        actual.add(dog);
        actual.add(dog2);
        actual.add(cat2);

        Collections.sort(actual);

        Assert.assertEquals(expected, actual);
    }
}
