package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void getNameTest(){
        //given
        String expectedName = "Ralph";
        Pet pet = new Pet(expectedName);

        //when
        String actualName = pet.getName();

        //then
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void setNameTest(){
        //given
        String initialName = "Ralph";
        String newName = "Biggie";

        //when
        Pet pet = new Pet(initialName);
        pet.setName(newName);

        //then
        String actualName = pet.getName();
        Assert.assertEquals(newName, actualName);

    }

    @Test
    public void speakTest() {
        //given
        String newName = "Biggie";
        String expected = "screech";

        //when
        Pet pet = new Pet(newName);

        //then
        String speak = pet.speak();
        Assert.assertEquals(expected, speak);
    }
}
