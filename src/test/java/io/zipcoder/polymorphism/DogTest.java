package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test

    public void testDogName() {


        Dog dog = new Dog("Justin");
        String expected = dog.getName();
        String actual = "Frank";
        Assert.assertNotEquals(expected, actual);

    }
    @Test
    public void testSpeak() {
        Dog dog = new Dog("Justin");

        String expected = "woof";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSpeak2() {
        Dog dog = new Dog("Justin");

        String expected = "";
        String actual = dog.speak();

        Assert.assertNotEquals(expected, actual);
    }





}