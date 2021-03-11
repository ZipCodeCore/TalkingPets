package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest extends Pet {

    @Test
    public void catConstructorTest() {
        // Given
        String expectedName = "Cat name";
        String expectedType = "cat";
        Cat cat = new Cat();

        // When
        String actualName = cat.getName();
        String actualType = cat.getType();



        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType, actualType);


        @Test
        public void getNameTest(){
            Cat cat = new Cat("Tom", "cat");
            String expectedName = "Tom";
            String actualName = cat.getName();
            Assert.assertEquals(expectedName, actualName);
        }

        @Test
        public void speakTest(){
            Cat cat = new Cat("Tom", "cat");
            String expectedSpeak = "Meow!";
            String actualSpeak = cat.speak();
            Assert.assertEquals(expectedSpeak, actualSpeak);
        }
    }
}
