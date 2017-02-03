package collins.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by johncollins on 1/31/17.
 */
public class CatTest {

    Pet testCat;

    @Before
    public void setUp() throws Exception {
        testCat = new Cat("Mr.Cat");
    }
    @Test
    public void speakTest(){
        String actual = testCat.speak();
        String expected = "meow";
        //String expected = null;
        assertEquals("should return 'meow' ", expected, actual);
        }
    @Test
    public void nameTest(){
        String actual = testCat.name;
        String expected = "Mr.Cat";
        //String expected = null;
        assertEquals("should return 'Mr.Cat' ", expected, actual);
    }
}
