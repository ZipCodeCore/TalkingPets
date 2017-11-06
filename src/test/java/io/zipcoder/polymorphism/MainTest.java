package io.zipcoder.polymorphism;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Parrot;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 11/6/17.
 */
public class MainTest {

    Main main;

    @Before
    public void setUp(){

        main = new Main();

    }

    @Test
    public void setGetNumberOfPetsTest(){
        main.setNumberOfPets(5);

        int expected = 5;
        int actual = main.getNumberOfPets();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNewPetOfTypeTest(){
        Pet dog = main.makeNewPetOfType("Dog");
        Assert.assertTrue(dog instanceof Dog);

        Pet cat = main.makeNewPetOfType("Cat");
        Assert.assertTrue(cat instanceof Cat);

        Pet parrot = main.makeNewPetOfType("Parrot");
        Assert.assertTrue(parrot instanceof Parrot);
    }

}
