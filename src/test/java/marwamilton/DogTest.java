package marwamilton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mkulima on 1/31/17.
 */
public class DogTest {
    Pet testPet;

    @Before
    public void setup(){
        testPet = new Dog("davido");
    }

    @Test
    public void speakTest(){
        String testMessage = "Dog speak method fail";
        String expectedSpeak = "Woof! Woof!";
        Assert.assertEquals(testMessage,  expectedSpeak, testPet.speak());
    }

}