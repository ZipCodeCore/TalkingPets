package io.zipcoder.polymorphism;


import org.junit.Assert;
import org.junit.Test;


public class PetTest {

    @Test
    public void getNameTest(){

        //Given

        Dog doggo = new Dog("", "Doggo");
        Cat kasumi = new Cat("", "Kasumi");
        Snake snek = new Snake("", "Snek");


        String expectedDog = new String("Doggo");
        String expectedCat = new String("Kasumi");
        String expectedSnake = new String( "Snek");

        //When

        String actualDog = doggo.getName();
        String actualCat = kasumi.getName();
        String actualSnake = snek.getName();

        //Then

        Assert.assertEquals(" doggo", expectedDog, actualDog);
        Assert.assertEquals(" cat", expectedCat, actualCat);
        Assert.assertEquals(" snek", expectedSnake, actualSnake);
    }

    @Test

    public void speakTest(){

        Dog doggo = new Dog("", "Doggo");
        Cat kasumi = new Cat("", "Kasumi");
        Snake snek = new Snake("", "Snek");

        String expectedDog = new String( "Woof");
        String expectedCat = new String("Meow");
        String expectedSnake = new String("Parseltongue");

        String actualDog = doggo.speak();
        String actualCat = kasumi.speak();
        String actualSnake = snek.speak();

        Assert.assertEquals(expectedDog, actualDog);
        Assert.assertEquals(expectedCat, actualCat);
        Assert.assertEquals(expectedSnake, actualSnake);


    }



}
