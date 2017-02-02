package holland.andres;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

/**
 * Created by andresholland on 1/31/17.
 */
public class IOTest {

    @Test
    public void askHowManyPetsTest () {
        String data = "5";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        IO io = new IO();
        int expected = 5;
        int actual = io.askHowManyPets();
        assertEquals(expected, actual);
    }

    @Test
    public void askNameOfPetTest () {
        String data = "sparky";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        IO io = new IO();
        String expected = "sparky";
        String actual = io.askNameOfPet();
        assertEquals(expected, actual);
    }

    @Test
    public void askTypeOfPetTest () {
        String data = "cat";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        IO io = new IO();
        String expected = "cat";
        String actual = io.askTypeOfPet();
        assertEquals(expected, actual);
    }

    @Test
    public void printListOfPetsTest () {
    PetDataWarehouse petDataWarehouse = new PetDataWarehouse();
    Cat cat = new Cat("Smelly");
    petDataWarehouse.addToPetsList(cat);
    String expected = "Smelly, meow";
    Pet actualObject = petDataWarehouse.getPetsList().get(0);
    String actual = actualObject.getName() + ", " + actualObject.speak();
    assertEquals(expected, actual);
    }

}