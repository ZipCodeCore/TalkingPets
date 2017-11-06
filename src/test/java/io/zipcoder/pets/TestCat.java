package io.zipcoder.pets;

import org.junit.Test;
import org.junit.Assert;
public class TestCat {

        @Test
        public void testGetName() {
            Pet pet = new Cat("cat", "A");
            String expected = "A";
            String actual = pet.getName();
            Assert.assertEquals(expected,actual);
        }
        @Test
        public void testSpeak(){
            Pet pet= new Cat("cat","B");
            String expexted= "Meowww";
            String actual= pet.speak();
            Assert.assertEquals(expexted,actual);
        }

}
