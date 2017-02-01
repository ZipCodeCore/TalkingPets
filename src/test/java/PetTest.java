import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by randallcrame on 1/31/17.
 */
public class PetTest {
    Pet pet;
    Pet pet2;
    @Before
    public void setUp(){
        pet = new Pet("Cb");
        pet2 = new Pet("Camp");
    }

    @Test
    public void speakTest(){
        String expected = "Remember to push often!";
        String actual = pet.speak();
        Assert.assertEquals("Expected 'Remember to push often!' to return", expected,actual);
    }

    @Test
    public void compareTo1Test(){
        int expected = 1;
        int actual = pet.compareTo(pet2);
        Assert.assertEquals("Will return a 1 because pet should be sorted behind pet", expected, actual);
    }

    @Test
    public void compareTo0Test(){
        int expected = 0;
        int actual = pet.compareTo(pet);
        Assert.assertEquals("Will return a 0 because pet should be equal pet", expected, actual);
    }

    @Test
    public void compareToNegative1Test(){
        int expected = -1;
        int actual = pet2.compareTo(pet);
        Assert.assertEquals("Will return a -1 because pet should be sorted in front pet", expected, actual);
    }
}
