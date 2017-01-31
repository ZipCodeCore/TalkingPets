package io.zipcoder.pets;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class InputOutputTest {
    InputOutput io = new InputOutput();

    @Test
    public void askHowManyPetsTest() {
        String howMany = "4";
        System.setIn(new ByteArrayInputStream(howMany.getBytes()));
        int expected = 4;
        int actual = io.askHowManyPets();
        assertEquals("4 expected", expected, actual);
    }

    @Test
    public void askNameOfPetTest() {
        String nameOfPet = "Jimmy";
        System.setIn(new ByteArrayInputStream(nameOfPet.getBytes()));
        String expected = "Jimmy";
        String actual = io.askNameOfPet();
        assertEquals("Jimmy expected", expected, actual);
    }

    @Test
    public void askTypeOfPetTest() {
        String typeOfPet = "cat";
        System.setIn(new ByteArrayInputStream(typeOfPet.getBytes()));
        String expected = "cat";
        String actual = io.askTypeOfPet();
        assertEquals("cat expected", expected, actual);
    }

    @Test
    public void printListTest() {
        ArrayList<Pet> petsList = new ArrayList<Pet>();
        petsList.add(new Cat("steve"));
        String expected = "The pet's name is steve and it says 'meow' when it speaks";
        String actual = io.printList();
        assertEquals("I expect 'the pet's name is steve and it says meow when it speaks'", expected, actual);
    }

}