import io.zipcoder.pets.Cat;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by tolaniibikunle on 1/31/17.
 */
public class CatTest {
    Cat cat;

   @Before
    public void setUp() {
       cat = new Cat("Jasper");
    }

    @Test
    public void speakTest(){
        String expected = "meow";
        String actual = cat.speak();
        Assert.assertEquals("I am expecting Meow",expected,actual);
    }



}
