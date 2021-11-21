package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class RabbitTest {
    @Test
    public void testSpeak(){
        Rabbit rabbit= new Rabbit(null,null,null);
        rabbit.speak();
        Assert.assertEquals("rab rab!",rabbit.speak());
    }

    @Test
    public void testName(){
        Rabbit rabbit = new Rabbit("lucky" ,5,"Caves");
        rabbit.setName("lucky");
        String actual = rabbit.getName();
        String expected = "lucky";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBreed(){
       Rabbit rabbit = new Rabbit("lucky",5,"Cavies");
        String actual= rabbit.getBreed();
        String expected = "Cavies";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testAge(){
        Rabbit rabbit= new Rabbit("lucky",5,"Cavies");
        Integer actual = rabbit.getAge();
        Integer expected = 5;
        Assert.assertEquals(expected,actual);
    }
}
