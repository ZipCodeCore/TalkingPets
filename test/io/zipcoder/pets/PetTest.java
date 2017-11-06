package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class PetTest {
    @Test
    public void compareTo() throws Exception {
        String[] dogNames = {"Henry", "Erica", "Harold", "Cal"};
        String[] catNames = {"Henry", "Don", "Alan"};
        String[] fishNames = {"Bubbles", "Nemo", "Henry"};
        ArrayList<Pet> pets = new ArrayList<Pet>();

        for (String eachDog : dogNames) {
            Dog dog = new Dog(eachDog);
            pets.add(dog);
        }
        for (String eachCat : catNames) {
            Cat cat = new Cat(eachCat);
            pets.add(cat);
        }
        for (String eachFish : fishNames) {
            Fish fish = new Fish(eachFish);
            pets.add(fish);
        }

        String expected = "sort lists of your objects by name, breaking ties by class type";
        String actual = "";


        Collections.sort(pets);

        for (int i = 0; i<pets.size(); i++) {
            actual += "A pet " + pets.get(i).getClass().getSimpleName() + ", " + pets.get(i).getName() + "\n";
        }

        Assert.assertEquals(expected,actual);
    }



    @Test
    public void getNameTest(){
        Pet pet = new Pet();
        String expected = "Russel";

        pet.setName("Russel");
        String actual = pet.getName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setNameTest(){
        Pet pet = new Pet();
        String expected = "Marlowe";

        pet.setName("Joe");
        pet.setName("Marlowe");

        String actual = "Marlowe";

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void speakTest(){
        Pet pet = new Pet();

        String expected = "I am not your 'buddy,' pal.";
        String actual = pet.speak();

        Assert.assertEquals(expected,actual);

    }
}