package io.zipcoder.petsTest;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import io.zipcoder.pets.PetOwner;
import org.junit.Assert;
import org.junit.Test;

public class petOwner {

    /**
     * - testPetOwnerConstructor
     * - testSetNumberOfPets
     * - testSetPetNames
     * - testSetPetType
     */

    @Test
    public void petOwnerConstructorTest(){
        //given
        String givenName = "John";
        //when
        PetOwner petOwner = new PetOwner(givenName);
        String retrievedName = petOwner.getName();
        //then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void setNumberOfPetsTest(){
        //given
        PetOwner petOwner = new PetOwner("John");
        Integer numOfPets = 2;
        //when
        petOwner.setNumberOfPets(numOfPets);
        Integer retrievedNumOfPets = petOwner.getNumberOfPets();
        //then
        Assert.assertEquals(numOfPets, retrievedNumOfPets);
    }

    @Test
    public void addPetTest(){
        //given
        PetOwner petOwner = new PetOwner("John");
        petOwner.setNumberOfPets(2);
        Dog dog = new Dog("Sparky", 0);
        Cat cat = new Cat("Snoop", 1);
        //when
        petOwner.addPet(dog);
        petOwner.addPet(cat);
        Pet[] givenPets = {dog, cat};
        Pet[] retrievedPets = petOwner.getPets();
        //then
        Assert.assertEquals(givenPets,retrievedPets);

    }

    @Test
    public void getPetByIdTest(){
        //given
        PetOwner petOwner = new PetOwner("John");
        petOwner.setNumberOfPets(2);
        Dog dog = new Dog("Sparky", 0);
        Cat cat = new Cat("Snoop", 1);
        //when
        petOwner.getPetById(0);
        String dogName = "Sparky";
        //then
        Assert.assertEquals(dogName, dog.getName());
    }

    @Test
    public void removePetTest(){
        //given
        PetOwner petOwner = new PetOwner("John");
        petOwner.setNumberOfPets(2);
        Dog dog = new Dog("Sparky", 0);
        Cat cat = new Cat("Snoop", 1);
        //when
        petOwner.removePet(dog);
        //then
        Assert.assertNull(petOwner.getPetById(0));
    }

    @Test
    public void setPetNameTest(){
        //given
        PetOwner petOwner = new PetOwner("John");
        petOwner.setNumberOfPets(2);
        Dog dog = new Dog("Sparky", 0);
        String newDogName = "Lemon";
        //when
        petOwner.setPetName(dog, newDogName);
        //then
        Assert.assertEquals(newDogName, dog.getName());

    }


}
