package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    @Test
    public void nameTest() {
        // Given
        Bird bird = new Bird("BlueJay");
        String expected = "BlueJay";

        // When
        String actual = bird.name();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given
        Bird bird = new Bird("BlueJay");
        String expected = "Chirp Chirp";

        // When
        String actual = bird.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
