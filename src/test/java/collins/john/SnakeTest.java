package collins.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by johncollins on 1/31/17.
 */
public class SnakeTest {
    Pet testSnake;

    @Before
    public void setUp() throws Exception {
        testSnake = new Snake("Mr.Snake");
    }

    @Test
    public void speakTest() {
        String actual = testSnake.speak();
        String expected = "Hisss";
        //String expected = null;
        assertEquals("should return 'hiss' ", expected, actual);
    }

    @Test
    public void nameTest() {
        String actual = testSnake.name;
        String expected = "Mr.Snake";
        //String expected = null;
        assertEquals("should return Mr.Snake", expected, actual);
    }

}

