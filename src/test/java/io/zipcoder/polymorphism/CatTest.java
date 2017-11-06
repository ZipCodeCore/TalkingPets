package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    Cat cat = new Cat("", "Kiki");

    @Test
    public void speakTest(){
        String expected = "Meow";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

@Test

    public void setCat(){


        String expected = "Kiki";
        cat.setName("Kiki");

        String actual = cat.getName();
}

}