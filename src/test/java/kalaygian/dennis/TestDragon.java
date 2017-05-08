package kalaygian.dennis;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by denniskalaygian on 5/2/17.
 */
public class TestDragon {

    @Test
    public void testSpeakReturnType(){
        //Given
        Dragon dragon = new Dragon();
        Class expectedValueType = "AUGH".getClass();

        //When
        Class returnValueType = dragon.speak().getClass();

        //Then
        Assert.assertEquals("The return value is not a string", expectedValueType, returnValueType);
    }

    @Test
    public void testSpeakReturnValue(){
        //Given
        Dragon dragon = new Dragon();
        String expectedValue = "AUGH";

        //When
        String returnValue = dragon.speak();

        //Then
        Assert.assertEquals("The dragon is making a weird noise", expectedValue, returnValue);
    }
}
