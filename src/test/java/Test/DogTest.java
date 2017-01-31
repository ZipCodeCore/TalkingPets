package Test;

import io.zipcoder.pets.Dog;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class DogTest {
    Dog dog;

    @Before
    public void setUp() {
        dog = new Dog("Burrito","Dog");
    }

    @Test
    public void DoesDogSpeak() {
        String expected = "Kick, punch, it's all in the mind!";
        String actual = dog.speak();
        assertEquals("This dog must be an idiot, he can't even speak",expected,actual);
    }

}

