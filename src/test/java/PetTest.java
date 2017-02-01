import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by danries on 2/1/17.
 */
public class PetTest {

    Cat cat = new Cat("Chesire");
    Dog dog = new Dog("Hello");

    @Test
    public void compareTo(){
        assertTrue(0 > cat.compareTo(dog));
    }

}