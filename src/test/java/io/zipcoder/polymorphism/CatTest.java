package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testSpeak(){
        Cat cat = new Cat(null,null,null);
        cat.speak();
        Assert.assertEquals("Meow!",cat.speak());
    }

    @Test
    public void testName(){
        Cat cat = new Cat(null ,null,null);
        cat.setName("milo");
        String actual = cat.getName();
        String expected = "milo";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBreed(){
        Cat cat = new Cat("milo",5,"Tuxedo");
        String actual= cat.getBreed();
        String expected = "Tuxedo";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testAge(){
        Cat cat = new Cat("milo",5,"Tuxedo");
        Integer actual = cat.getAge();
        Integer expected = 5;
        Assert.assertEquals(expected,actual);
    }
}
