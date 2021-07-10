package io.zipcoder.petsTest;

import io.zipcoder.pets.Animal;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Food;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class DogTest {
    @Test
    public void dogConstructorTest(){
        //Given
        String givenName = "Sparky";
        Integer givenId = 0;
        //When
        Dog dog = new Dog(givenName, givenId);
        String retrievedName = dog.getName();
        Integer retrievedId = dog.getId();
        //Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest(){
        //given
        Dog dog = new Dog("Sparky", 0);
        String bark = "Bark!";
        //when
        String retrievedSpeak = dog.speak();
        //then
        Assert.assertEquals(bark, retrievedSpeak);
    }

    @Test
    public void getIdTest(){
        //given
        Integer givenId = 1;
        Dog dog = new Dog("Sparky", givenId);
        //when
        Integer retrievedId = dog.getId();
        //then
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void inheritanceOfAnimalTest(){
        //given
        Dog dog = new Dog("Sparky", 0);
        //then
        Assert.assertTrue(dog instanceof Pet);
    }

    @Test
    public void inheritanceOfMammalTest(){
        //given
        Dog dog = new Dog("Sparky", 0);
        //then
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void setNameTest() {
        // Given
        Dog dog = new Dog(null, null);
        String givenName = "Milo";

        // When
        dog.setName(givenName);

        // Then
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void eatTest(){
        //given
        Food treat = new Food();
        Dog dog = new Dog("Sparky", 0);
        //when
        dog.eat(treat);
        Food lastMeal = dog.getLastMealEaten();
        //then
        Assert.assertEquals(lastMeal,treat);
    }



}
