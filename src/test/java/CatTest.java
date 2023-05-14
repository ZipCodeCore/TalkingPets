import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by prestonbattin on 1/31/17.
 */
public class CatTest {

    Pet pet;

    @Test
    public void testCatSpeak(){

        pet = new Cat("Stacy");
        String exepected = "Meow";
        String actual = pet.speak();
        Assert.assertEquals("Testing the cat Speak method", exepected, actual);

    }

    @Test
    public void testCatName(){

        pet = new Cat("Stacy");
        String expected = "Stacy";
        String actual = pet.getName();
        Assert.assertEquals("Testing cat name", expected,actual);
    }
}
