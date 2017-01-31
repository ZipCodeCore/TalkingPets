package Test;

import io.zipcoder.pets.AnimalHouse;
import io.zipcoder.pets.Pet;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class AnimalHouseTest {
    AnimalHouse factory;

    @Before
    public void setUp() {
        factory = new AnimalHouse(3);
    }

    @Test
    public void TestCreateSinglePet() {
        Pet testPet = factory.createSinglePet();
        String expected = "Berto";
        String actual =  testPet.getName();
        assertEquals("This is not the pet's correct name",expected,actual);
    }

    @Test
    public void TestCreateListOfPetObjects() {
        factory.createListOfPetObjects(5);
        int expected = 4;
        int actual = factory.getPetList().size();
        assertEquals("The number of pets does not match what was expected",actual,expected);
    }
}
