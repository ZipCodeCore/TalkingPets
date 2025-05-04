package io.zipcoder.petsTest;

import io.zipcoder.pets.Animal;
import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class birdTest {
    @Test
    public void dogConstructorTest(){
        //Given
        String givenName = "Mango";
        Integer givenId = 0;
        //When
        Bird bird = new Bird(givenName, givenId);
        String retrievedName = bird.getName();
        Integer retrievedId = bird.getId();
        //Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest(){
        //given
        Bird bird = new Bird("Mango", 0);
        String speak = "Chirp!";
        //when
        String retrievedSpeak = bird.speak();
        //then
        Assert.assertEquals(speak, retrievedSpeak);
    }

    @Test
    public void getIdTest(){
        //given
        Integer givenId = 1;
        Bird bird = new Bird("Mango", 0);
        //when
        Integer retrievedId = bird.getId();
        //then
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void inheritanceOfPetTest(){
        //given
        Bird bird = new Bird("Mango", 0);
        //then
        Assert.assertTrue(bird instanceof Pet);
    }

    @Test
    public void inheritanceOfAnimalTest(){
        //given
        Bird bird = new Bird("Mango", 0);
        //then
        Assert.assertTrue(bird instanceof Animal);
    }

    @Test
    public void setNameTest() {
        // Given
        Bird bird = new Bird(null, null);
        String givenName = "Chipper";

        // When
        bird.setName(givenName);

        // Then
        String birdName = bird.getName();
        Assert.assertEquals(birdName, givenName);
    }
}
