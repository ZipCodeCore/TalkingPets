package io.zipcoder.pets;
import org.junit.Assert;
import org.junit.Test;


public  class DogTest {
    boolean dogIsPet;

    @Test
    public void testThePets() {
        Pet newPet = new Pet("Sire");
        if (newPet instanceof Pet) {
            dogIsPet = true;
        } else {
            dogIsPet = false;
        }
        Assert.assertTrue(dogIsPet);


    }

}