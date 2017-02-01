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

    @Test
    public void sortByNameTest() {
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(new Cat("fluffy"));
        petList.add(new Cat("zipper"));
        petList.add(new Dog("fluffy"));
        petList.add(new Dino("photography raptor"));
        String expected = "fluffy Cat\nfluffy Dog\nphotography raptor Dino\nzipper Cat";
        String actual = petDW.returnListAsString(petList);
        assertEquals("list sorted by name, tie broken by type",expected,actual);
    }

    @Test
    public void sortByTypeTest() {
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(new Dog("fluffy"));
        petList.add(new Dino("photography raptor"));
        petList.add(new Cat("fluffy"));
        petList.add(new Dino("barney"));
        petList.add(new Cat("zipper"));
        String expected = "fluffy Cat\nzipper Cat\nfluffy Dog\nbarney Dino\nphotography raptor Dino";
        String actual = petDW.returnListAsString(petList);
        assertEquals("list sorted by type, then name", expected, actual);
    }

}