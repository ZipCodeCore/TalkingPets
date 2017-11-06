package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

        boolean catIsPet;
        Pet newPet = new Pet("Cherry");
        Cat Cherry = new Cat("Cherry");

        @Test
        public void testThePets() {
            if (newPet instanceof Pet) {
                catIsPet = true;
            } else {
                catIsPet = false;
            }
            Assert.assertTrue(catIsPet);
        }

        @Test
        public void testCatHasName (){
            String expected = "Cherry";
            String actual = newPet.getName();
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void testCatCanSpeak (){
            String expected = "And a silver Spoon?";
            String actual = Cherry.Speak();
            Assert.assertEquals(expected, actual);
        }

    }

