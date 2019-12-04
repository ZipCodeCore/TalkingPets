package io.zipcoder.pets;
import org.junit.Assert;
import org.junit.Test;

public class PlatypusTest {

    @Test
    public void nullaryConstructorTest() {
        String expectedName = "Perry";
        Platypus platypus = new Platypus();

        String actualName = platypus.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void constructorWithNameTest() {
        String expectedName = "SirBarksAlots";
        Platypus platypus = new Platypus(expectedName);

        String actualName = platypus.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        Platypus platypus = new Platypus();
        String expected = "bow-wow";

        String actual = platypus.speak();

        Assert.assertEquals(expected, actual);
    }
}
