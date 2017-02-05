package humphrey.jeriah;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 2/1/17.
 */
public class PetTest {
    Pet pet;


    @Before
    public void setUp(){
        pet = new Pet("myPet");
    }


    @Test
    public void petSpeaksTest(){
        String expected = "I am your pet";
        String actual = pet.speak();
        assertEquals("I expect the speak method to return I am your pet", expected, actual);
    }

    @Test
    public void setNameChangesName(){
        String expected = "Dude";
        String actual = pet.setName("Dude");
        assertEquals("I expect the speak method to return I am your pet", expected, actual);

    }
    @Test
    public void compareToTest(){
        Pet pet2 = new Pet ("yourPet");
        int expected= -1;
        int actual = pet.compareTo(pet2);
        System.out.println(actual);
        assertEquals(expected, actual);

    }
    @Test
    public void compareToTestSameName(){
        Dog dog = new Dog();
        dog.setName("myPet");
        int expected= -1;
        int actual = dog.compareTo(pet);
        assertEquals(expected, actual);

    }
}