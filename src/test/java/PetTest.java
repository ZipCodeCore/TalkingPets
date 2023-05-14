import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prestonbattin on 2/1/17.
 */
public class PetTest {

    Pet cat, dog;

    @Before
    public void setup(){

        cat = new Cat("Kelly");
        dog = new Dog("A");
    }

    @Test
    public void compareToTest(){

        int expected = 1;
        int actual = cat.compareTo(dog);
        Assert.assertEquals("Testing compare method", expected, actual);
    }

}
