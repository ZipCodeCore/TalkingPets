package io.zipcoder;

import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;


public class ApplicationTest {

    Cat cat = new Cat("myCat");


    @Test
    public void getNameTest() {


        String expected = "myCat";

        String actual = cat.getName();

        Assert.assertEquals("The two cat names are equal", expected, actual);
    }

    @Test
    public void  setnametest(){

        cat.setName("NotMycat");

        String expected = "NotMycat";
        String actual = cat.getName();

        Assert.assertEquals("name are equal", expected, actual);
    }


    @Test
    public void speakTest() {


        String expected = "miaw";

         cat.speak();


    }


}
