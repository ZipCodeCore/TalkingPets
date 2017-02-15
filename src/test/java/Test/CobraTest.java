package Test;

import io.zipcoder.pets.Cobra;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class CobraTest {
    Cobra cobra;

    @Before
    public void setUp() { cobra = new Cobra("giJoe","Cobra"); }

    @Test
    public void DoesCatSing() {
        String expected = "Now I know, and knowing is half the battle!";
        String actual = cobra.speak();
        assertEquals("This cat must be an idiot, she can't even speak",expected,actual);
    }
}
