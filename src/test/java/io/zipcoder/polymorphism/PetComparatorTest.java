package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class PetComparatorTest {

    @Test
    public void testCompare(){
        ArrayList<Pet> petTest = new ArrayList<>();

        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet parrot = new Parrot();

        dog.setName("Riki");
        cat.setName("Mimi");

        petTest.add(dog);
        petTest.add(cat);
        petTest.add(parrot);

        int expected = 5;
        int actual = dog.compareTo(cat);


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareType(){
        ArrayList<Pet> petTest = new ArrayList<>();

        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet parrot = new Parrot();

        dog.setName("Riki");
        cat.setName("Riki");

        petTest.add(dog);
        petTest.add(cat);
        petTest.add(parrot);

        int expected = 0;
        int actual = dog.compareTo(cat);


        Assert.assertEquals(expected, actual);
    }
}
