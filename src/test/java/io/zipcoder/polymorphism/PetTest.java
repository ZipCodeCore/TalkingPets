package io.zipcoder.polymorphism;

import sun.jvm.hotspot.utilities.Assert;
import org.junit.Test;


public class PetTest {

    @Test
    public void getNameTest(){

        //Given

        Dog doggo = new Dog("Doggo");
        Cat cato = new Cat("Kasumi");
        Snake snako = new Snake("Snek");


        String expectedDog = new String("Doggo");
        String expectedCat = new String("Kasumi");
        String expectedSnake = new String( "Snek");

        //When

        String actualDog = doggo.getName();
        String actualCat = cato.getName();
        String actualSnake = snako.getName();

        //Then

        org.junit.Assert.assertEquals(" doggo", expectedDog, actualDog);
        org.junit.Assert.assertEquals(" doggo", expectedCat, actualCat);
        org.junit.Assert.assertEquals(" doggo", expectedSnake, actualSnake);
    }

    @Test

    public void speakTest(){

        Dog doggo = new Dog("Woof");
        Cat kasumi = new Cat("Meow");
        Snake snek = new Snake( "Parseltongue");

        String expectedDog = new String( "Woof");
        String expectedCat = new String("Meow");
        String expectedSnake = new String("Parseltongue");

        String actualDog = doggo.speak();
        String actualCat = kasumi.speak();
        String actualSnake = snek.speak();

        org.junit.Assert.assertEquals("Dog doggo", expectedDog, actualDog);
        org.junit.Assert.assertEquals("Cat Kasumi", expectedCat, actualCat);
        org.junit.Assert.assertEquals("Snake Snek", expectedSnake, actualSnake);


    }



}
