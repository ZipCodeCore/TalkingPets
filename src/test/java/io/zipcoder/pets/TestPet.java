package io.zipcoder.pets;

import org.junit.Test;
import org.junit.Assert;

public class TestPet {
    @Test
    public void testGetName() {
        Pet pet = new Pet("dog", "A");
        String expected = "A";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {
        Pet pet = new Pet("cat", "B");
        String expected = "Pet speaking from Super";
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareToByType() {
        Pet cat = new Cat("cat", "Tom");
        Pet dog = new Dog("dog", "Tom");
        int expected = cat.getClass().getName().compareTo(dog.getClass().getName());
        int actual = cat.compareTo(dog);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCompareToByName(){
        Pet cat = new Cat("cat", "Tom");
        Pet dog = new Dog("dog", "Jerry");
        int expected = cat.getName().compareTo(dog.getName());
        int actual = cat.compareTo(dog);
        Assert.assertEquals(expected, actual);

    }
}
