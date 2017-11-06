package io.zipcoder.polymorphism;

import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class PetTest {
    @Test
    public void getNameTest(){
        
        //Given
        Pet dog = new Pet();

        String expected = new String("Doggo");
        //When

        String actual = doggo.getName();

        //Then

        Assert.assertEquals(" doggo", expected, actual);

    }


}
