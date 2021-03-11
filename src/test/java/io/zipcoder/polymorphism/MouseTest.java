package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MouseTest extends Pet {

    @Test
    public void mouseConstructorTest() {
        // Given
        String expectedName = "Mouse name";
        String expectedType = "mouse";
        Mouse mouse = new Mouse();

        // When
        String actualName = mouse.getName();
        String actualType = mouse.getType();



        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType, actualType);


    @Test
    public void getNameTest(){
        Mouse mouse = new Mouse("Jerry", "mouse");
        String expectedName = "Jerry";
        String actualName = mouse.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest(){
        Mouse mouse = new Cat("Jerry", "mouse");
        String expectedSpeak = "Squeak!";
        String actualSpeak = mouse.speak();
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
    }
}