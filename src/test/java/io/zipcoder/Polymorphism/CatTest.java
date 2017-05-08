package io.zipcoder.Polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by brianmullin on 5/5/17.
 */
public class CatTest {

    //Cat Tests
    @Test
    public void testCatSpeakMethod() {
        Cat cat = new Cat();
        Assert.assertEquals("Testing cat speak override", "I meow", cat.speak());
    }
}
