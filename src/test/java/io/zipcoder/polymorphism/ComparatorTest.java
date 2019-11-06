package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class ComparatorTest {

    @Test
    public void compareToTest() {
        // Given
        Cat cat = new Cat("Tiger");
        Dog dog = new Dog("Bobby");

        // When
        PetComparator petComp = new PetComparator();
        Integer actual = petComp.compare(cat, dog);

        // Then
        Assert.assertTrue(actual<0);
    }

    @Test
    public void compareToTest2() {
        // Given
        Cat cat = new Cat("Tiger");
        Cat cat2 = new Cat("Tiger");

        // When
        PetComparator petComp = new PetComparator();
        Integer actual = petComp.compare(cat, cat2);

        // Then
        Assert.assertTrue(actual==0);
    }








}
