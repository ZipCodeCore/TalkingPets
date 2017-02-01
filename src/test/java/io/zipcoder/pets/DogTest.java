import io.zipcoder.pets.Dog;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * Created by tolaniibikunle on 1/31/17.
 */
public class DogTest {
    Dog dog;

    @Before
    public void setUp(){
        dog = new Dog("Noah");
    }
    @Test
    public void speakTest(){
    String expected = "roof";
    String actual = dog.speak();
    Assert.assertEquals("I am expecting Roof",expected,actual);
    }
}
