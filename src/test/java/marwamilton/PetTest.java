package marwamilton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mkulima on 1/31/17.
 */
public class PetTest {
    Pet testPet;

    @Before
    public void setup(){
        testPet = new Cat("catpuss");
    }

    @Test
    public void getNameTest() {
        String nameFailtMessage = "Pet name did not match expected.";
        String expectedName = "catpuss";
        Assert.assertEquals(nameFailtMessage, expectedName, testPet.getName());
    }

    @Test
    public void toStringTest(){
        String testMessage = "toString method fail";
        String expectedToString = " Kind: marwamilton.Cat\n Name: catpuss\n Speak: Meow! Meow!";
        Assert.assertEquals(testMessage, expectedToString, testPet.toString());
    }
}
