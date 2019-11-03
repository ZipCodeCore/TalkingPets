package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Bird;
import io.zipcoder.polymorphism.Pet;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void testSpeakMethod() {
//Given:
        Pet bird = new Bird("Polly");
//When:
        String expected = "Polly";
        String actual = bird.speak();

//Then:
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testTypeofPet() {
//Given:
        Pet bird = new Bird("Polly");
//When:
        String expected = "bird";
        String actual = bird.getType();

//Then:

        Assert.assertEquals(expected,actual);
    }

}