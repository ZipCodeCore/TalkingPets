package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestCat {
        @Test
        public void catConstructorTest(){
            //Given
            String given = "Ellie";
            //When
            Cat cat = new Cat(given);
            String expected = cat.getName();
            //Then
            Assert.assertEquals(given, expected);
        }

        @Test
        public void speakTest(){
            //given
            Cat cat = new Cat("Ellie");
            String given = "Meow!";
            //when
            String expected = cat.speak();
            //then
            Assert.assertEquals(given, expected);
        }

        @Test
        public void setNameTest() {
            //Given
            Cat cat = new Cat("");
            String given = "Ellie";

            //When
            cat.setName(given);

            //Then
            String expected = cat.getName();
            Assert.assertEquals(given, expected);
        }

        @Test
        public void inheritanceOfPetTest(){

            Cat cat = new Cat("Ellie");
            Assert.assertTrue(cat instanceof Pet);

        }

        @Test
        public void inheritanceOfAnimalTest(){

            Cat cat = new Cat("Ellie");
            Assert.assertTrue(cat instanceof Animal);

        }
    }
