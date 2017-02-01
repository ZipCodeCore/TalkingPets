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
        petDW.addPet(new Cat("frank"));
        int expected = 1;
        int actual = petDW.getPetsList().size();
        assertEquals("length of list 1 expected", expected, actual);
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
        PetGenerator petGenerator = new PetGenerator();
        petDW.addPet(petGenerator.createPet("frank", "dino"));
        int expected = 1;
        int actual = petDW.getPetsList().size();
        assertEquals("1 expected", expected, actual);
    }

}