package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tolaniibikunle on 2/1/17.
 */
public class PetTest {



    @Test
    public void CompareToTest() {
        Pet dog1 = new Dog("dan"); // comparing dog to cat, the difference between the two
        Pet dog2 = new Dog("luke");
        Assert.assertTrue("i am expecting a zero", 0 == dog1.compareTo(dog2));
    }
}