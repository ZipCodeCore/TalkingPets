import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by danries on 1/31/17.
 */
public class DogTEST {

    Dog dog;

    @Before public void initialize(){
        dog = new Dog("Digdog");
    }

    @Test
    public void speakTEST(){
        String expected = "Woof Woof";
        String actual = dog.speak();
        assertEquals("We expect to get the dog speak method to return a string of the dogs String",expected,actual);
    }
}
