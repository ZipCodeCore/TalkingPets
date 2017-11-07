package io.zipcoder.pets;
import org.junit.Assert;
import org.junit.Test;


public  class DogTest {
    boolean dogIsPet;
    Pet newPet = new Pet("Sire");
    Dog sire = new Dog("Sire");

    @Test
    public void testThePets() {
        if (newPet instanceof Pet) {
            dogIsPet = true;
        } else {
            dogIsPet = false;
        }
        Assert.assertTrue(dogIsPet);
    }

    @Test
    public void testDogHasName (){
        String expected = "Sire";
        String actual = newPet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDogCanSpeak (){
        String expected = "bark";
        String actual = sire.Speak();
        Assert.assertEquals(expected, actual);
    }

}