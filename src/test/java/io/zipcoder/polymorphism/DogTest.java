package io.zipcoder.polymorphism;

import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void dogInstanceOfTest(){
        Dog dog= new Dog("Ay");
        Assert.assertTrue(dog instanceof Pet);
    }
    @Test
    public void dogGetNameTest(){
        Dog dog= new Dog("Ay");
        String actual = dog.getName();

        Assert.assertEquals("Ay",actual);
    }

    @Test
    public void dogSetNameTest(){
        Dog dog= new Dog("Ay");
        dog.setName("Bee");
        String actual = dog.getName();

        Assert.assertEquals("Bee",actual);
    }
    @Test
    public void dogSpeakTest(){
        Dog dog= new Dog("Ay");
        String actual = dog.speak();
        Assert.assertEquals("Woof!",actual);
    }
}
