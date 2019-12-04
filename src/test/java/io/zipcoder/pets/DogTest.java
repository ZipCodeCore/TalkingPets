package io.zipcoder.pets;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void nullaryConstructorTest() {
        String expectedName = "Clifford";
        Dog dog = new Dog();

        String actualName = dog.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void constructorWithNameTest() {
        String expectedName = "SirBarksAlots";
        Dog dog = new Dog(expectedName);

        String actualName = dog.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        Dog dog = new Dog();
        String expected = "bow-wow";

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
}
