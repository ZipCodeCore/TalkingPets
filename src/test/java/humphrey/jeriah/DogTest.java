package humphrey.jeriah;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 2/1/17.
 */
public class DogTest {

    @Test

    public void dogSpeaksTest(){
        Dog dog = new Dog();
        String expected = "Woof";
        String actual = dog.speak();
        assertEquals("I expect the speak method to return Woof", expected, actual);
    }

    }

