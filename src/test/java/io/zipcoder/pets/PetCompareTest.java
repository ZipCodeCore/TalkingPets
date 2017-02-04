package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tolaniibikunle on 2/1/17.
 */
public class PetCompareTest {
    Dog dog = new Dog("andy");
    Cow cow = new Cow("dan");
    PetComparator petCompare = new PetComparator();

    @Test
    public void petCompareTest(){
        int actual = 0;
        int expected = petCompare.compare(cow,dog);
        Assert.assertEquals("I am expecting 0",expected,actual);

    }
}
