package kalaygian.dennis;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by denniskalaygian on 5/2/17.
 */
public class TestCat {

    @Test
    public void testSpeakReturnType(){
        //Given
        Cat cat = new Cat();
        Class expectedValueType = "Meow".getClass();

        //When
        Class returnValueType = cat.speak().getClass();

        //Then
        Assert.assertEquals("The return value is not a string", expectedValueType, returnValueType);
    }

    @Test
    public void testSpeakReturnValue(){
        //Given
        Cat cat = new Cat();
        String expectedValue = "Meow";

        //When
        String returnValue = cat.speak();

        //Then
        Assert.assertEquals("The cat is making a weird noise", expectedValue, returnValue);
    }
}
