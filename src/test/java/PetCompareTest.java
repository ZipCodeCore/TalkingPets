import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by danries on 2/1/17.
 */
public class PetCompareTest {

    Cat cat;
    Dog dog;
    PetCompare compare = new PetCompare();

    @Before
    public void setUp(){
        cat = new Cat("Chesire");
        dog = new Dog("Doge");
    }

    @Test
    public void compareTEST(){
        assertTrue(0 < dog.compareTo(cat));
    }

}