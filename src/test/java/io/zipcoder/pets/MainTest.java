package io.zipcoder.pets;
import org.junit.Assert;

import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void getIntegerInput() throws Exception {
    }

    @Test
    public void getStringInput() throws Exception {
    }

    @Test
    public void main() throws Exception {
    }


    @Test
    public void addPetToArray(){
        ArrayList<Pet> petAddedToArray = new  ArrayList<Pet>();
        petAddedToArray.add(new Pet("Sam"));
        petAddedToArray.add(new Pet("Jeff"));
        petAddedToArray.add(new Pet("Biff"));
        int expected = 3;

        int actual = petAddedToArray.size();

       Assert.assertEquals(expected,actual);



    }

}