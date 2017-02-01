import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by randallcrame on 1/31/17.
 */
public class DogTest {
    Dog pet;

    @Before
    public void setUp(){
        pet = new Dog("Ham");
    }

    @Test
    public void speakTest(){
        String expected = "Save Often";
        String actual = pet.speak();
        Assert.assertEquals("Expected 'Save Often' to return", expected,actual);
    }
}
