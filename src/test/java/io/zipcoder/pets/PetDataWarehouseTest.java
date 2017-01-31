package io.zipcoder.pets;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class PetDataWarehouseTest {
    PetDataWarehouse petDW = new PetDataWarehouse();

    @Test
    public void getPetsListTest() {
        ArrayList<Pet> petsList = new ArrayList<Pet>();
        petsList.add(new Cat("frank"));
        ArrayList<Pet> expected = petsList;
        ArrayList<Pet> actual = petDW.getPetsList();
        assertEquals("List of cat called frank", expected, actual);
    }

    @Test
    public void getNumberOfPetsTest() {
        int expected = 4;
        petDW.setNumberOfPets(4);
        int actual = petDW.getNumberOfPets();
        assertEquals("4 expected", expected, actual);
    }

    @Test
    public void addPetTest() {
        petDW.addPet("frank", "dino");
        int expected = 1;
        int actual = petDW.getPetsList().size();
        assertEquals("1 expected", expected, actual);
    }

}