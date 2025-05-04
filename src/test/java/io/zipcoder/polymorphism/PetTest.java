package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PetTest extends TestCase {

    public void testAddPet() {
        Pet pet =new Pet();
        String expected ="karadi";
        Dog dog = new Dog(expected,null,"lab");
        pet.addPet(dog);
        Assert.assertEquals(expected,dog.getName());

    }

    public void testRemovePet() {
        Pet pet =new Pet();
        Integer expected = 2;
        Dog dog = new Dog(null,null,null);
        Dinosaur dino = new Dinosaur("bumpy",1,"trico");
        Cat cat = new Cat("marble",5,"fat");
        pet.addPet(dog);
        pet.addPet(dino);
        pet.addPet(cat);
        pet.removePet(dog);
        Assert.assertEquals(expected,pet.numberOfPets());
    }

    public void testSpeak() {
        Pet pet =new Pet(null,null,null);
        pet.speak();
        Assert.assertEquals("I'm not talking until you tell me what kinda pet i'm",pet.speak());
    }
    @Test
    public void testInheritance() {
        Pet pet = new Dog(null,null,null);
        Assert.assertTrue(pet instanceof Pet);
    }


}