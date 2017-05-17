package io.zipcoder.Polymorphism;

import org.junit.Test;
import org.junit.Assert;
/**
 * Created by aaronlong on 5/1/17.
 */
public class AppTest {

    private Pet animal;


    @Test
    public void testIdentifyDog() {

        //Given
        animal = App.petIdentifier("Fido","dog");

        //When


        //Then
        Assert.assertTrue("Correct String should be ", animal instanceof Dog);

    }

    @Test
    public void testIdentifyCat() {

        //Given
        animal = App.petIdentifier("Mittens","cat");

        //When


        //Then
        Assert.assertTrue("Correct String should be ", animal instanceof Cat);

    }

    @Test
    public void testIdentifyBird() {

        //Given
        animal = App.petIdentifier("Tweety","bird");

        //When


        //Then
        Assert.assertTrue("Correct String should be ", animal instanceof Bird);

    }

    @Test
    public void testIdentifyOtherPet() {

        //Given
        animal = App.petIdentifier("Gary","snail");

        //When


        //Then
        Assert.assertTrue("Correct String should be ", animal instanceof Pet);

    }


}
