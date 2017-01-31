package marwamilton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mkulima on 1/31/17.
 */
public class CatTest {
    Pet testPet;

    @Before
    public void setup(){
        testPet = new Cat("koko");
    }

    @Test
    public void speakTest(){
        String testMessage = "Cat speak method fail";
        String expectedSpeak = "Meow! Meow!";
        Assert.assertEquals(testMessage,  expectedSpeak, testPet.speak());
    }

}
