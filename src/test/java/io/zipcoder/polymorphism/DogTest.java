package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testSpeak(){
        Dog dog = new Dog(null,null,null);
        dog.speak();
        Assert.assertEquals("Bark!",dog.speak());
    }

    @Test
    public void testName(){
        Dog dog = new Dog(null,null,null);
        dog.setName("jim");
        String actual = dog.getName();
        String expected = "jim";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBreed(){
        Dog dog = new Dog("jim",5,"Tuxedo");
        String actual= dog.getBreed();
        String expected = "Tuxedo";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testAge(){
        Dog dog = new Dog("milo",5,"Tuxedo");
        Integer actual = dog.getAge();
        Integer expected = 5;
        Assert.assertEquals(expected,actual);
    }
}
