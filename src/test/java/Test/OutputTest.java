package Test;

import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class OutputTest {
    Pet puppy;

    @Before
    public void setUp() {
        Pet puppy = new Dog("Burrito","Dog");
    }

    @Test
    public void TestDisplayPetInfo() {
        String expected = "PetName is a PetType";
        String actual = puppy.getType() + " is a " + puppy.getName();
        assertEquals("You are not showing the correct string",expected,actual);
    }
}


