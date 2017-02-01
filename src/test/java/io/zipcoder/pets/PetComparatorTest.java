package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by gillianreynolds-titko on 2/1/17.
 */
public class PetComparatorTest {

    PetComparator petComparator;

    @Before
    public void setUp(){
        petComparator = new PetComparator();
    }

    @Test
    public void compareSameTypeTest(){
        Cat cat = new Cat("Toby");
        Cat cat2 = new Cat("Toby");
        int actual = petComparator.compare(cat, cat2);
        assertTrue("Expected 0", 0 == petComparator.compare(cat, cat2));
    }

    @Test
    public void compareDiffTypeTest(){
        Cat cat = new Cat("Toby");
        Dog dog = new Dog("Tom");
        int actual = petComparator.compare(cat, dog);
        assertTrue("Expected 0", 0 == petComparator.compare(cat, dog));
    }
}
