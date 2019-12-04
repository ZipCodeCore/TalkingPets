package io.zipcoder.pets;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void nullaryConstructorTest() {
        String expectedName = "Furball";
        Cat cat = new Cat();

        String actualName = cat.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void constructorWithNameTest() {
        String expectedName = "SirMeowsAlot";
        Cat cat = new Cat(expectedName);

        String actualName = cat.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        Cat cat = new Cat();
        String expected = "meow ~";

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
}
