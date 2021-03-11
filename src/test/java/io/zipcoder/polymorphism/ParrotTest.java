package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTest extends Pet {

    @Test
    public void parrotConstructorTest() {
        // Given
        String expectedName = "Parrot name";
        String expectedType = "parrot";
        Parrot parrot = new Parrot();

        // When
        String actualName = parrot.getName();
        String actualType = parrot.getType();



        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType, actualType);


        @Test
        public void getNameTest(){
            Parrot parrot = new Parrot("DJ C#", "parrot");
            String expectedName = "DJ C#";
            String actualName = parrot.getName();
            Assert.assertEquals(expectedName, actualName);
        }

        @Test
        public void speakTest(){
            Parrot parrot= new Parrot("DJ C#", "parrot");
            String expectedSpeak = "Give me a /br";
            String actualSpeak = parrot.speak();
            Assert.assertEquals(expectedSpeak, actualSpeak);
        }
    }
}

