package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class CatTest {

    Cat cat; //Create an instance of the Cat class

    @Before
    public void setUp(){

        cat = new Cat("Tiddles");
    }

    @Test //Test initially with the simple stub speak method in Cat that returns null
    public void speakTest(){
        String expected = "Meow";
        String actual = cat.speak();
        assertEquals("Expected Meow", expected, actual);
    }

    @Test
    public void compareToNegOneTest(){ //Both pet types are different
        int expected = -1;
        Dog dog = new Dog("Toby"); //Create a Dog instance just for this test
        int actual = cat.compareTo(dog);
        assertEquals("Expected to get -1", expected, actual);
    }

    @Test
    public void compareToZeroTest(){ //Both pet types are the same
        int expected = 0;
        int actual = cat.compareTo(cat);
        assertEquals("Expected to get 1", expected, actual);
    }

    @Test
    public void compareToStringsDifferent(){ //Compare the pet string names
        int expected = -1;
        Dog dog = new Dog("Toby");
        int actual = cat.compareTo(dog, 1);
        assertEquals("Expected -1", expected, actual);
    }

    @Test
    public void compareToStringsSame(){ //Compare the pet string names
        int expected = 0;
        Cat cat2 = new Cat("Toby");
        int actual = cat.compareTo(cat2, 0);
        assertEquals("Expected 0", expected, actual);
    }
}
