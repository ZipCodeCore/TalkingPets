package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PetTests {

    @Test
    public void dogSpeakTest() {
        //Given
        Pet dog = new Dog();
        String expected = "Doggie says woof woof";
        //When
        String actual = "Doggie says " + dog.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest() {
        //Given
        Pet cat = new Cat();
        String expected = "Cat says meow";
        //When
        String actual = "Cat says " + cat.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void goldishSpeakTest() {
        //Given
        Pet goldfish = new Goldfish();
        String expected = "Goldfish says glub glub";
        //When
        String actual = "Goldfish says " + goldfish.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catDogGoldfishDefaultNameTest() {
        //Given
        Pet goldfish = new Goldfish();
        Pet cat = new Cat();
        Pet dog = new Dog();
        String expected = "DorothyFidoMarty";
        //When
        Pet[] pets = new Pet[3];
        pets[0] = goldfish;
        pets[1] = cat;
        pets[2] = dog ;
        Arrays.sort(pets);
        String actual = pets[0].getName() + pets[1].getName() + pets[2].getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catDogHaveSameNameTest() {
        //Given
        Pet goldfish = new Goldfish();
        Pet cat = new Cat();
        Pet dog = new Dog();
        cat.setName("Ruby");
        dog.setName("Ruby");
        String expected = "GoldfishMartyCatRubyDogRuby";
        //When
        Pet[] pets = new Pet[3];
        pets[0] = goldfish;
        pets[1] = cat;
        pets[2] = dog ;
        Arrays.sort(pets);
        String actual = pets[0].getClass().getSimpleName() + pets[0].getName() + pets[1].getClass().getSimpleName() + pets[1].getName() + pets[2].getClass().getSimpleName() + pets[2].getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void allHaveSameNameTest() {
        //Given
        Pet goldfish = new Goldfish();
        Pet cat = new Cat();
        Pet dog = new Dog();
        goldfish.setName("Dorothy");
        dog.setName("Dorothy");
        String expected = "CatDorothyDogDorothyGoldfishDorothy";
        //When
        Pet[] pets = new Pet[3];
        pets[0] = goldfish;
        pets[1] = cat;
        pets[2] = dog ;
        Arrays.sort(pets);
        String actual = pets[0].getClass().getSimpleName() + pets[0].getName() + pets[1].getClass().getSimpleName() + pets[1].getName() + pets[2].getClass().getSimpleName() + pets[2].getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void allCatsTest() {
        
    }

}
