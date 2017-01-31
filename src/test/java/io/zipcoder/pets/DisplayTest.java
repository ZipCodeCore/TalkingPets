package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author
 */
public class DisplayTest
{
    Display display;

    @Before
    public void setup()
    {
        display = new Display();
    }

    @Test
    public void promptForNumberOfPetsTest()
    {
        String expected = "How many pets do you have?:";

        String actual = display.promptForNumberOfPets();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void promptForTypeOfPetUserHas()
    {
        String expected = "What kind of animal is this pet?:";

        String actual = display.promptForTypeOfPet();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void promptForNameOfPetUserHas()
    {
        String expected = "What is the name of this pet?:";

        String actual = display.promptForNameOfPet();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void displayPetInfoDogTest()
    {
        Dog dog = new Dog();
        dog.setName("Dewey");

        String expected = "I am Dewey and I say Bork";

        String actual = display.displayPetInfo(dog);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void displayPetInfoCatTest()
    {
        Cat cat = new Cat();
        cat.setName("Misty");

        String expected = "I am Misty and I say Meow!";

        String actual = display.displayPetInfo(cat);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void displayPetInfoPigTest()
    {
        Pig pig = new Pig();
        pig.setName("Babe");

        String expected = "I am Babe and I say Oink";

        String actual = display.displayPetInfo(pig);

        Assert.assertEquals(expected, actual);
    }
}
