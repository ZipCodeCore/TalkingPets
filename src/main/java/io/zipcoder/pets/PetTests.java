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
        //Given
        Pet ruby = new Cat();
        Pet dottie = new Cat();
        Pet sixer = new Cat();
        Pet iris = new Cat();
        ruby.setName("Ruby");
        sixer.setName("Sixer");
        iris.setName("Iris");
        String expected = "DorothyIrisRubySixer";
        //When
        Pet[] pets = new Pet[4];
        pets[0] = ruby;
        pets[1] = dottie;
        pets[2] = sixer;
        pets[3] = iris;
        Arrays.sort(pets);
        String actual = "";
        for(Pet p : pets) {
            actual += p.getName();
        }
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void comparatorEqualsTest() {
        //Given
        PetComparator petComparator = new PetComparator();
        Pet ruby = new Cat();
        Pet dottie = new Cat();
        int expected = 0;
        //When
        int actual = petComparator.compare(ruby, dottie);
        //Then
        Assert.assertEquals("same basic info", expected, actual);
    }

    @Test
    public void comparatorDiffTypesTest() {
        //Given
        PetComparator petComparator = new PetComparator();
        Pet ruby = new Cat();
        Pet otto = new Goldfish();
        //When
        int result = petComparator.compare(otto, ruby);
        //Then
        Assert.assertTrue(result < 0);
    }

    @Test
    public void comparatorCatDogTest() {
        //Given
        PetComparator petComparator = new PetComparator();
        Pet ruby = new Cat();
        Pet goldie = new Dog();
        int expected = -1;
        //When
        int actual = petComparator.compare(ruby, goldie);
        //Then
        Assert.assertEquals(expected, actual);
    }

}
