package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FishTest {

    @Test
    public void setNameTest(){
        Fish fish = new Fish();
        String expected = "Larry";

        fish.setName("Larry");
        String actual = fish.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNameTest(){
        Fish fish = new Fish("Aquaman");

        String expected = "Aquaman";
        String actual = fish.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Fish fish = new Fish();

        String expected = "......";

        String actual = fish.speak();

        Assert.assertEquals(expected,actual);

    }

}