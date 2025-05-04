package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class PetOwnerTest {

    @Test
    public void testPetOwnerConstructor() {
        //given
        String expectedName = "Kira";
        //when
        PetOwner petOwner = new PetOwner(expectedName, 4);
        String actualName = petOwner.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetNumberOfPets() {
        //given
        int expected = 1;
        PetOwner petOwner = new PetOwner("Annette", expected);
        //when
        petOwner.setNumberOfPets(expected);
        int actual = petOwner.getNumberOfPets();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddPets() {
        //given
        PetOwner petOwner = new PetOwner("Caroline", 0);
        petOwner.setNumberOfPets(2);
        Cat cat1 = new Cat("Luna", 0);
        Cat cat2 = new Cat("Binks", 1);
        //when
        petOwner.addPet(cat1);
        petOwner.addPet(cat2);
        Pet actualPet = petOwner.getPetById(0);
        //then
        Assert.assertEquals(cat1.getName(), actualPet.getName());
    }

    @Test
    public void testGetPetById() {
        //given
        String expected = "YunYun";
        PetOwner petOwner = new PetOwner("Rayna", 2);
        Dog dog = new Dog(expected, 0);
        Cat cat = new Cat("Sophie", 1);
        //when
        Pet actual = petOwner.getPetById(0);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetPetName() {
        //given
        String expected = "Poppy";
        PetOwner petOwner = new PetOwner("Peter", 0);
        petOwner.setNumberOfPets(2);
        Cat cat = new Cat("Ghost", 0);
        //when
        petOwner.setPetName(cat, expected);
        String actual = cat.getName();
        //then
        Assert.assertEquals(expected, actual);
    }
}
