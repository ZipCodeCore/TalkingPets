package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {


 @Test
 public void testSpeak() {
    Cat cat = new Cat("Justin the cat");

     String expected = "woof";
     String actual = cat.speak();

     Assert.assertNotEquals(expected, actual);
 }
    @Test
    public void testSpeak2() {
        Cat cat = new Cat("Justin the cat");

        String expected = "meow";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {

        String name = "Justin";
       Cat cat = new Cat(name);
        String expected = cat.getName();
        String actual = name;
        Assert.assertEquals(expected, actual);

    }




}