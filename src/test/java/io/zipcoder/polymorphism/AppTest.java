package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.pets.Cat;
import io.zipcoder.polymorphism.pets.Dog;
import io.zipcoder.polymorphism.pets.Horse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    App testApp = new App();

    @Test
    public void addPet() {

        testApp.addPet("Cat");
        testApp.addPet("Dog");
        int expected = 2;
        int actual = testApp.petList.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void printPets() {
        testApp.addPet("Cat");
        testApp.addPet("Dog");

        String expected = "No name cat";
        String actual = testApp.petList.get(0).getName();
        Assert.assertEquals(expected,actual);

        expected = "No name dog";
        actual = testApp.petList.get(1).getName();
        Assert.assertEquals(expected,actual);
    }
}