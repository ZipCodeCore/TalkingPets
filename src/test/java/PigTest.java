import io.zipcoder.pets.Pet;
import io.zipcoder.pets.Pig;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by prestonbattin on 1/31/17.
 */
public class PigTest {

    Pet pet;

    @Test
    public void testPigSpeak(){

        pet = new Pig("Albert");
        String exepected = "Oink";
        String actual = pet.speak();
        Assert.assertEquals("Testing the pig Speak method", exepected, actual);

    }

    @Test
    public void testPigName(){

        pet = new Pig("Albert");
        String expected = "Albert";
        String actual = pet.getName();
        Assert.assertEquals("Testing pig name", expected,actual);
    }



}
