package humphrey.jeriah;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 2/1/17.
 */
public class CatTest {


    @Test
    public void catSpeaksTest(){
        Cat cat = new Cat();
        String expected = "Meow";
        String actual = cat.speak();
        assertEquals("I expect the speak method to return I am your pet", expected, actual);
    }


    }

