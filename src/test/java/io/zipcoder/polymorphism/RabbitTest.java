package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class RabbitTest {

    @Test
    public void testSetRabbitName() {
        //given
        Rabbit rabbit = new Rabbit();
        String expectedName = "Momo";
        //when
        rabbit.setName(expectedName);
        String actual = rabbit.getName();
        //then
        Assert.assertEquals(expectedName, actual);
    }

    @Test
    public void rabbitSpeakTest() {
        //given
        Rabbit rabbit =  new Rabbit();
        //then
        String actual =  rabbit.speak();
        //when
        Assert.assertEquals("Ribbit!", actual);
    }

}
