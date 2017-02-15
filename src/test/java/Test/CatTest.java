package Test;

import io.zipcoder.pets.Cat;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class CatTest {
    Cat cat;

    @Before
    public void setUp() { cat = new Cat("Pizza","Cat"); }

    @Test
    public void DoesCatSing() {
        String expected = "Samurai Pizza Cats!";
        String actual = cat.speak();
        assertEquals("This cat must be an idiot, she can't even speak",expected,actual);
    }
}

