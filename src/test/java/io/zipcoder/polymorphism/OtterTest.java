package io.zipcoder.polymorphism;

import org.junit.Test;
import org.junit.Assert

public class OtterTest  {

    @Test
    public void testOtterSpeak(){
        Otter otter = new Otter();
        String expected = "Chuckle";
        String actual = otter.speak();
        Assert.assertEquals(expected, actual);

    }
}
