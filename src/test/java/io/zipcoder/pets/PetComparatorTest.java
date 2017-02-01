package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 2/1/17.
 */
public class PetComparatorTest {
    PetComparator petComparator = new PetComparator();

    @Test
    public void compareTest(){
        Dog doggo = new Dog("snowball");
        Cat kitteh = new Cat("meowmeow");
        int expected = -1;
        int actual = petComparator.compare(doggo, kitteh);
        assertEquals("1 expected", expected,actual);

    }

    @Test
    public void compare2Test(){
        Dog doggo = new Dog("apple");
        Dino kitteh = new Dino("banana");
        int expected = -6;
        int actual = petComparator.compare(doggo, kitteh);
        assertEquals("1 expected", expected,actual);

    }
}