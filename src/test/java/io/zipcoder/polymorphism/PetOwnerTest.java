package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetOwnerTest {


    @Test
    public void testPetOwner() {
        //given
        Cat cat = new Cat();
        PetOwner owner = new PetOwner(cat);
        Pet[] pets = owner.getPets();
        //when
        Pet actual = pets[0];
        //then
        Assert.assertEquals(actual, cat);

    }

    @Test
    public void testAddPet() {
        Dog dog = new Dog();
        PetOwner owner =  new PetOwner();

        owner.addPet(dog);
        Pet[] pets = owner.getPets();

        Assert.assertEquals(dog, pets[0]);

    }

    @Test
    public void testGetPet() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        PetOwner owner = new PetOwner(dog, cat);

        Pet[] pets = {dog, cat};
        Pet[] actual = owner.getPets();

        Assert.assertArrayEquals(pets, actual); //for array tests




    }
}
