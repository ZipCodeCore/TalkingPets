package kalaygian.dennis;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by denniskalaygian on 5/2/17.
 */
public class TestDog {

    @Test
    public void testSpeakReturnType(){
        //Given
        Dog dog = new Dog();
        Class expectedValueType = "Woof".getClass();

        //When
        Class returnValueType = dog.speak().getClass();

        //Then
        Assert.assertEquals("The return value is not a string", expectedValueType, returnValueType);
    }

    @Test
    public void testSpeakReturnValue(){
        //Given
        Dog dog = new Dog();
        String expectedValue = "Woof";

        //When
        String returnValue = dog.speak();

        //Then
        Assert.assertEquals("The dog is making a weird noise", expectedValue, returnValue);
    }
}
