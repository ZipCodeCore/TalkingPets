package io.zipcoder.pets;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class InputOutputTest {


    @Test
    public void askHowManyPetsTest() {
        ByteArrayInputStream input = new ByteArrayInputStream("4".getBytes());
        InputOutput io = new InputOutput(input);
        int expected = 4;
        int actual = io.askHowManyPets();
        assertEquals("4 expected", expected, actual);
    }

    @Test
    public void askNameOfPetTest() {
        ByteArrayInputStream input = new ByteArrayInputStream("Jimmy".getBytes());
        InputOutput io = new InputOutput(input);
        String expected = "Jimmy";
        String actual = io.askNameOfPet();
        System.setIn(System.in);
        assertEquals("Jimmy expected", expected, actual);

    }

    @Test
    public void askTypeOfPetTest() {
        ByteArrayInputStream input = new ByteArrayInputStream("cat".getBytes());
        InputOutput io = new InputOutput(input);
        String expected = "cat";
        String actual = io.askTypeOfPet();
        assertEquals("cat expected", expected, actual);
    }

    @Test
    public void printListTest() {
        ArrayList<Pet> petsList = new ArrayList<>();
        petsList.add(new Cat("steve"));
        InputOutput io = new InputOutput();
        String expected = "The pet's name is steve and it meows when it speaks";
        Scanner scanner = new Scanner(System.in);
        io.printListWithSpeak(petsList);
        String actual = scanner.nextLine();
        assertEquals("I expect 'the pet's name is steve and it says meow when it speaks'", expected, actual);
    }

}