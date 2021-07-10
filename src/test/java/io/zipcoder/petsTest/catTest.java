package io.zipcoder.petsTest;

import io.zipcoder.pets.*;
import org.junit.Assert;
import org.junit.Test;

public class catTest {

    @Test
    public void catConstructorTest(){
        //Given
        String givenName = "Taco";
        Integer givenId = 0;
        //When
        Cat cat = new Cat(givenName, givenId);
        String retrievedName = cat.getName();
        Integer retrievedId = cat.getId();
        //Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest(){
        //given
        Cat cat = new Cat("Taco", 1);
        String bark = "Meow";
        //when
        String retrievedSpeak = cat.speak();
        //then
        Assert.assertEquals(bark, retrievedSpeak);
    }

    @Test
    public void getIdTest(){
        //given
        Integer givenId = 1;
        Cat cat = new Cat("Taco", givenId);
        //when
        Integer retrievedId = cat.getId();
        //then
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void inheritanceOfPetTest(){
        //given
        Cat cat = new Cat("Taco", 1);
        //then
        Assert.assertTrue(cat instanceof Pet);
    }

    @Test
    public void inheritanceOfAnimalTest(){
        //given
        Cat cat = new Cat("Taco", 1);
        //then
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void setNameTest() {
        // Given
        Cat cat = new Cat(null, null);
        String givenName = "Chubby";

        // When
        cat.setName(givenName);

        // Then
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

}
