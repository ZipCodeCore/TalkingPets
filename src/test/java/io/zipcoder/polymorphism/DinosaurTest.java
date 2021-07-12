package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class DinosaurTest extends TestCase {

    public void testSpeak() {
        Dinosaur dinosaur =new Dinosaur(null,null,null);
        dinosaur.speak();
        Assert.assertEquals("Rawr!",dinosaur.speak());

    }

    public void testName(){
        Dinosaur dinosaur =new Dinosaur(null,null,null);
        dinosaur.setName("Joseph");
        String actual = dinosaur.getName();
        String expected = "Joseph";
        Assert.assertEquals(actual, expected);
    }

    public void testBreed(){
        Dinosaur dinosaur = new Dinosaur("Terrence", 15, "Friendly Rex");
        String actual = dinosaur.getBreed();
        String expected = "Friendly Rex";

        Assert.assertEquals(actual, expected);
    }

    public void testAge(){
        Dinosaur dinosaur = new Dinosaur("Terrence", 15, "Friendly Rex");
        Integer actual = dinosaur.getAge();
        Integer expected = 15;

        Assert.assertEquals(actual, expected);
    }
}
