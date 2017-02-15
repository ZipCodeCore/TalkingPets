package Test;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class PetTest {
    Pet pet;

    @Before
    public void setUp() {
        pet = new Dog("Barry","Dog");
    }

    @Test
    public void TestGetName() {
        String expected = "Carl";
        String actual = pet.getName();
        assertEquals("This did not return Barry",actual,expected);
    }

    @Test
    public void TestGetType() {
        String expected = "Dog";
        String actual = pet.getType();
        assertEquals("This did not return Dog",actual,expected);
    }

    @Test
    public void TestCompareTo() {
        Pet cat = new Cat("Ardo","Cat");
        int expected = -1;
        int actual = cat.compareTo(pet);
        assertEquals("Comparator did not work",expected,actual);
    }
}
