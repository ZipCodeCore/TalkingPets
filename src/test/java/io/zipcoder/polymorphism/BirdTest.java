package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;



public class BirdTest {

    @Test
    public void testSpeak() {
        Bird bird  = new Bird("Justin the bird");

        String expected = "meow";
        String actual = bird.speak();

        Assert.assertNotEquals(expected, actual);
    }
    @Test
    public void testSpeak2() {
        Bird bird = new Bird("Justin the bird");

        String expected = "chirp";
        String actual = bird.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {

        String name = "Justin";
        Bird bird = new Bird(name);
        String expected = bird.getName();
        String actual = name;
        Assert.assertEquals(expected, actual);

    }


}