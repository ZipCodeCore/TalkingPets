package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void testAddPet() {
        Pet pet =new Pet();
        String expected ="milo";
        Dog dog = new Dog(expected,null,"lab");
        pet.addPet(dog);
        Assert.assertEquals(expected,dog.getName());

    }

    @Test

    public void testRemovePet() {
        Pet pet =new Pet();
        Integer expected = 2;
        Dog dog = new Dog(null,null,null);
        Rabbit rabbit = new Rabbit("lucky",1,"Cavies");
        Cat cat = new Cat("milo",5,"fat");
        pet.addPet(dog);
        pet.addPet(rabbit);
        pet.addPet(cat);
        pet.removePet(dog);
        Assert.assertEquals(expected,pet.numberOfPets());
    }

    @Test

    public void testSpeak() {
        Pet pet =new Pet(null,null,null);
        pet.speak();
        Assert.assertEquals("I am Not Going To Speak Until You tell what Pet i am",pet.speak());
    }

    @Test
    public void testInheritance() {
        Pet pet = new Dog(null,null,null);
        Assert.assertTrue(pet instanceof Pet);
    }


}
