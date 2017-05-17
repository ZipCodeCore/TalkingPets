package io.zipcoder.Polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by brianmullin on 5/5/17.
 */
public class DogTest {

    //Dog Tests
    @Test
    public void testDogSpeakMethod() {
        Dog dog = new Dog();
        Assert.assertEquals("Testing dog speak override", "I bark", dog.speak());
    }


}
