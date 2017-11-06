/*
package io.zipcoder.polymorphism.io.zipcoder.pets;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Parrot;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PetsTest {

    Pet[] pets = new Pet[]{new Cat(), new Dog(), new Parrot()};
    String[] names = new String[]{"Garfield", "Rover", "Polly"};
    String[] calls = new String[]{"Meow~", "Bark bark!", "Polly wanna cracker!"};
    Pet pet;
    int i = 0;

    public void allTests() {


    }

    @Before
    public void setUp () {
        pet = pets[i];
    }

    //change the setup to match pet copy pasta the actual tests

    @Test
    public void thisPetInstanceOfPetTest () {
        Assert.assertTrue(pet instanceof Pet);
    }

    @Test
    public void petNameSetGetTest () {
        pet.setName(name);
        String expected = name;
        String actual = pet.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petSpeakTest () {
        String expected = call;
        String actual = pet.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petToString () {
        pet.setName(name);

        String expected = "This pet is a " + pet.getClass().getSimpleName() + " named " + name + ", who goes " + call;
        String actual = pet.toString();

        Assert.assertEquals(expected, actual);
    }
}
*/
