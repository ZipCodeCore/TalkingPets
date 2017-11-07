package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class TestCompare {
    @Test
    public void testCompareByName(){
        Pet cat = new Cat("cat","Mimi");
        Pet dog = new Dog("dog","Kitty");
        int expected= cat.getName().compareTo(dog.getName());
        int actual = cat.compareTo(dog);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCompareByType(){
        Pet cat = new Cat("cat","Mimi");
        Pet dog = new Dog("dog","Mimi");
        int expected = cat.getClass().getName().compareTo(dog.getClass().getName());
        int actual = cat.compareTo(dog);
        Assert.assertEquals(expected,actual);
    }
}
