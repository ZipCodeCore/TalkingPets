package io.zipcoder.pets;


import org.junit.Test;
import org.junit.Assert;


/**
 * Created by Timothy R Rager on 11/6/17.
 */
public class PetsTest {

    @Test
    public void testSetGetPetName(){

        Pet nagini = new Snake();
        nagini.setName("Nagini");
        String expected="Nagini";
        String actual=nagini.getName();
        Assert.assertTrue(expected.equals(actual));

    }

    @Test
    public void testTypeOfPet(){
        Pet nagini = new Snake();
        Pet krypto = new Dog();
        Pet luna = new Cat();

        Assert.assertTrue (nagini instanceof Snake && nagini instanceof Pet);
        Assert.assertTrue (krypto instanceof Dog && krypto instanceof Pet);
        Assert.assertTrue (luna instanceof Cat && luna instanceof Pet);
        Assert.assertTrue("Snake".equals(nagini.getClass().getName()));
        Assert.assertTrue("Dog".equals(krypto.getClass().getName()));
        Assert.assertTrue("Cat".equals(luna.getClass().getName()));
    }

    @Test
    public void testSpeak(){
        Pet nagini = new Snake();
        Pet krypto = new Dog();
        Pet luna = new Cat();

        Assert.assertTrue("Parseltongue".equals(nagini.speak()));
        Assert.assertTrue("Woof".equals(krypto.speak()));
        Assert.assertTrue("Meow".equals(luna.speak()));
    }

}
