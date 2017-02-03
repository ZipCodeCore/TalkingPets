package collins.john;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by johncollins on 1/31/17.
 */
public class DogTest {
    Pet testDog;

    @Before
    public void setUp() throws Exception {
        testDog = new Dog("Mr.Dog");
    }

    @Test
    public void speakTest() {
        String actual = testDog.speak();
        String expected = "woof";
        //String expected = null;
        assertEquals("should return 'bork' ", expected, actual);
    }

    @Test
    public void nameTest() {
        String actual = testDog.name;
        String expected = "Mr.Dog";
        //String expected = null;
        assertEquals("should return Mr.Dog", expected, actual);
    }
}

