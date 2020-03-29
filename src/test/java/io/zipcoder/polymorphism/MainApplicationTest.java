package io.zipcoder.polymorphism;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Hampster;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {
    Pet testHamster = new Hampster("hampster", "Apple");
    Pet testCat = new Cat("cat", "Sylvester");
    Pet testDog = new Dog("dog", "XX");
    ArrayList<Pet> petArrayList = new ArrayList<Pet>();

    @Test
    public void ArrayListTest() {
        petArrayList.add(testDog);
        Integer expected = 1;
        Integer actual = petArrayList.size();
        Assert.assertEquals(actual, expected);
    }
    @Test
        public void ArrayListTest2() {
        petArrayList.add(testCat);
        petArrayList.add(testHamster);
        Integer expected = 2;
        Integer actual = petArrayList.size();
        Assert.assertEquals (actual, expected);
    }
}
