package Test;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import io.zipcoder.pets.PetComparator;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by alfatihmukhtar on 2/1/17.
 */
public class PetComparatorTest {
    Pet pet1;
    Pet pet2;
    PetComparator petComparator =  new PetComparator();

    @Before
    public void setUp() {
        pet1 = new Dog("Charles","Dog");
        pet2 = new Cat("Chitty","Cat");
    }

    @Test
    public void TestCompareMethod() {
        int expected = -1;
        int actual = petComparator.compare(pet2,pet1);
        assertEquals("These are not the same",expected,actual);
    }
}
