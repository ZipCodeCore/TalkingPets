package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest extends Pet {

    @Test
    public void dogConstructorTest() {
        // Given
        String expectedName = "dog name";
        String expectedType = "dog";
        Dog dog = new Dog();

        // When
        String actualName = dog.getName();
        String actualType = dog.getType();



        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType, actualType);


        @Test
        public void getNameTest(){
            Dog dog = new Dog("Luna", "dog");
            String expectedName = "Luna";
            String actualName = dog.getName();
            Assert.assertEquals(expectedName, actualName);
        }

        @Test
        public void speakTest(){
            Dog dog = new Dog("Luna", "dog");
            String expectedSpeak = "Woof!";
            String actualSpeak = dog.speak();
            Assert.assertEquals(expectedSpeak, actualSpeak);
        }
    }
}

