import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by danries on 1/31/17.
 */
public class CatTEST {
    Cat cat;

    @Before public void initialize(){
        cat = new Cat("Oblock");
    }

    @Test
    public void speakTest(){
        String expected = "Meow";
        String actual = cat.speak();
        assertEquals("We expect to get Meow for the cat type",expected,actual);
    }

}
