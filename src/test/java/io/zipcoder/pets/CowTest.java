package io.zipcoder.pets;

import io.zipcoder.pets.Cow;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tolaniibikunle on 1/31/17.
 */
public class CowTest {
    Cow cow;

    @Before
    public void setUp(){
      cow = new Cow("Gary");
    }

    @Test
    public void speakTest(){
        String expected = "Moo";
        String actual = cow.speak();
        Assert.assertEquals("I am expecting Moo",expected,actual);
    }
}
