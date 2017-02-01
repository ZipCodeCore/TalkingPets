import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by randallcrame on 1/31/17.
 */
public class PetTest {
    Pet pet;

    @Before
    public void setUp(){
        pet = new Pet("Ham");
    }

    @Test
    public void speakTest(){
        String expected = "Remember to push often!";
        String actual = pet.speak();
        Assert.assertEquals("Expected 'Remember to push often!' to return", expected,actual);
    }
}
