package io.zipcoder.polymorphism.io.zipcoder.pets;

import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void dogInstanceOfPetTest(){
        Dog dog = new Dog();

        Assert.assertTrue(dog instanceof Pet);
    }

    @Test
    public void dogNameSetGetTest(){
        Dog dog = new Dog();

        dog.setName("Rover");
        String expected = "Rover";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogSpeakTest(){
        Dog dog = new Dog();

        String expected = "Bark bark!";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
}
