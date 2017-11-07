package io.zipcoder.polymorphism;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Lion;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class CompareTest {

    Pet cat1;
    Pet cat2;
    Pet dog1;
    Pet dog2;
    Pet lion1;
    Pet lion2;
    Pet[] unsorted;

    @Before
    public void setUp(){
        cat1 = new Cat();
        cat1.setName("pet1");
        dog1 = new Dog();
        dog1.setName("pet1");
        lion1 = new Lion();
        lion1.setName("pet1");
        cat2 = new Cat();
        cat2.setName("pet2");
        dog2 = new Dog();
        dog2.setName("pet2");
        lion2 = new Lion();
        lion2.setName("pet2");
        unsorted = new Pet[]{lion2, dog2, cat2, lion1, dog1, cat1};
    }

    @Test
    public void sortByNameTest(){
        Arrays.sort(unsorted);
        Pet[] expected = new Pet[]{cat1, dog1, lion1, cat2, dog2, lion2};

        Assert.assertArrayEquals(expected, unsorted);
    }

    @Test
    public void sortByTypeTest(){
        Arrays.sort(unsorted, Pet.compareByType);
        Pet[] expected = new Pet[]{cat1, cat2, dog1, dog2, lion1, lion2};

        Assert.assertArrayEquals(expected, unsorted);
    }
}
