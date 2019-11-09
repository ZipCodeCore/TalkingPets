package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetWarehouseTest {
    @Test
    public void testCreatePetFromType1() {
        PetWarehouse house = new PetWarehouse();
        String name = "Tucker";
        String type = "dog";
        Pet pet = house.createPetFromType(type, name);
        Assert.assertTrue(pet instanceof Dog);
    }
    @Test
    public void testCreatePetFromType2() {
        PetWarehouse house = new PetWarehouse();
        String name = "Charlie";
        String type = "cat";
        Pet pet = house.createPetFromType(type, name);
        Assert.assertTrue(pet instanceof Cat);
    }
    @Test
    public void testCreatePetFromType3() {
        PetWarehouse house = new PetWarehouse();
        String name = "Lamar";
        String type = "snake";
        Pet pet = house.createPetFromType(type, name);
        Assert.assertTrue(pet instanceof Snake);
    }
    @Test
    public void testCreatePetFromType4() {
        PetWarehouse house = new PetWarehouse();
        String name = "Annabelle";
        String type = "spider";
        Pet pet = house.createPetFromType(type, name);
        Assert.assertTrue(pet instanceof UnknownPet);
    }

    @Test
    public void testCreatePets() {
        Integer numberOfPets = 4;
        String[] petTypes = {"dog", "cat", "snake", "spider"};
        String[] petNames = {"Tucker", "Charlie", "Lamar", "Annabelle"};
        PetWarehouse house = new PetWarehouse();
        Pet[] pets = house.createPets(numberOfPets, petTypes, petNames);
        Assert.assertEquals(4, pets.length);
        for (int i = 0; i < numberOfPets; i++) {
            Assert.assertEquals(petNames[i], pets[i].getName());
            Assert.assertEquals(petTypes[i], pets[i].getType());
        }
    }

    @Test
    public void testConstructor() {
        Integer numberOfPets = 4;
        String[] petTypes = {"dog", "cat", "snake", "spider"};
        String[] petNames = {"Tucker", "Charlie", "Lamar", "Annabelle"};
        PetWarehouse house = new PetWarehouse(numberOfPets, petTypes, petNames);
        Pet[] pets = house.getPets();
        Assert.assertEquals(4, pets.length);
        for (int i = 0; i < numberOfPets; i++) {
            Assert.assertEquals(petNames[i], pets[i].getName());
            Assert.assertEquals(petTypes[i], pets[i].getType());
        }
    }

    @Test
    public void testDisplayPetInfo() {
        Integer numberOfPets = 4;
        String[] petTypes = {"dog", "cat", "snake", "spider"};
        String[] petNames = {"Tucker", "Charlie", "Lamar", "Annabelle"};
        PetWarehouse house = new PetWarehouse(numberOfPets, petTypes, petNames);
        String actual = house.displayPetInfo();
        String expected = "You have 4 pets.\nPet 1 is a dog named Tucker.\nwoof!\nPet 2 is a cat named Charlie.\nmeow!\nPet 3 is a snake named Lamar.\nslither!\nPet 4 is a spider named Annabelle.\n(spider noises)!";
        Assert.assertEquals(expected, actual);
    }

}
