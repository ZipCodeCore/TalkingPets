import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import io.zipcoder.pets.Pig;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by prestonbattin on 1/30/17.
 */
public class PetTest {


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
