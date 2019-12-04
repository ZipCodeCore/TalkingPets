package io.zipcoder.pets;
import org.junit.Test;
import org.junit.Assert;

public class PetTest {

    @Test
    public void testDogInheritance() {
        Pet p = new Dog();
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void testCatInheritance() {
        Pet p = new Cat();
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
        public void testPlatypusInheritance() {
        Pet p = new Platypus();
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void testDogImplementation() {
        Pet p = new Dog();
        Assert.assertTrue(p instanceof Animal);
    }

    @Test
    public void testCatImplementation() {
        Pet p = new Cat();
        Assert.assertTrue(p instanceof Animal);
    }

    @Test
    public void testPlatypusImplementation() {
        Pet p = new Platypus();
        Assert.assertTrue(p instanceof Animal);
    }

}
