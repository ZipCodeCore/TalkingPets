package io.zipcoder.Polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by brianmullin on 5/5/17.
 */
public class BirdTest {

    //Bird Tests
    @Test
    public void testBirdSpeakMethod() {
        Bird bird = new Bird();
        Assert.assertEquals("Testing cat speak override", "I sing", bird.speak());
    }
}
