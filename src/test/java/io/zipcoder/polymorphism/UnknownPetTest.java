package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class UnknownPetTest {
    @Test
    public void testSpeak() {
        UnknownPet pet = new UnknownPet("Tucker", "blorp");
        String actual = pet.speak();
        String expected = "(blorp noises)!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor1() {
        UnknownPet pet = new UnknownPet("EEEEEEEE", "blorp");
        Assert.assertEquals("EEEEEEEE", pet.getName());
    }
    @Test
    public void testConstructor2() {
        UnknownPet pet = new UnknownPet("Flop", "blorp");
        Assert.assertEquals("blorp", pet.getType());
    }
}
