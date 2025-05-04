import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by prestonbattin on 1/30/17.
 */
public class DogTest {


    Pet pet;

    @Test
    public void testDogSpeak(){

        pet = new Dog("Kevin");
        String expected = "Woof";
        String actual = pet.speak();
        Assert.assertEquals("Testing dog speak", expected,actual);
    }

    @Test
    public void testDogName(){

        pet = new Dog("Kevin");
        String expected = "Kevin";
        String actual = pet.getName();
        Assert.assertEquals("Testing dog name", expected,actual);
    }

}
