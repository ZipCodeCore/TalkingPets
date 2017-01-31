package marwamilton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mkulima on 1/31/17.
 */
public class IguanaTest {
    Pet testPet;

    @Before
    public void setup(){
        testPet = new Iguana("maru");
    }

    @Test
    public void speakTest(){
        String testMessage = "Iguanaspeak method fail";
        String expectedSpeak = "What a gwan!";
        Assert.assertEquals(testMessage,  expectedSpeak, testPet.speak());
    }

}