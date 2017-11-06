package io.zipcoder.pets;
import org.junit.Assert;
import org.junit.Test;

public class TestDog {
    @Test
    public void testGetName() {
        Pet pet = new Dog("dog", "A");
        String expected = "A";
        String actual = pet.getName();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSpeak(){
        Pet pet= new Dog("dog","B");
        String expected= "Woof";
        String actual= pet.speak();
        Assert.assertEquals(expected,actual);
    }
}
