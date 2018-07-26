package io.zipcoder.pets;


import io.zipcoder.polymorphism.ComparableTest;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

/**
 * Created by Timothy R Rager on 11/6/17.
 */
public class PetsTest {

    private Pet pet;
    private String name;
    private String speech;

    public PetsTest(Pet passedPet, String passedName, String passedSpeech){
        this.pet=passedPet;
        this.name=passedName;
        this.speech=passedSpeech;
    }

    @Test
    public void testInstanceOfPet(){
        Assert.assertTrue (pet instanceof Pet);
    }

    @Test
    public void testSetGetName(){
        pet.setName(name);
        String actual = pet.getName();

        Assert.assertEquals(name, actual);
    }

    @Test
    public void testSpeech(){
        String actual = pet.speak();
        Assert.assertEquals(speech, actual);
    }

}