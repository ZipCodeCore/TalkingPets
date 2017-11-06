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
        Pet krypto = new Dog();
        Pet luna = new Cat();

        nagini.setName("Nagini");
        String expected="Nagini";
        String actual=nagini.getName();
        Assert.assertEquals(expected, actual);

        krypto.setName("Krypto");
        expected="Krypto";
        actual=krypto.getName();
        Assert.assertEquals(expected, actual);

        luna.setName("Luna");
        expected="Luna";
        actual=luna.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTypeOfPet(){
        Pet nagini = new Snake();
        Pet krypto = new Dog();
        Pet luna = new Cat();

        Assert.assertTrue (nagini instanceof Snake && nagini instanceof Pet);
        Assert.assertTrue (krypto instanceof Dog && krypto instanceof Pet);
        Assert.assertTrue (luna instanceof Cat && luna instanceof Pet);
        Assert.assertEquals("Snake", nagini.getClass().getName());
        Assert.assertEquals("Dog", krypto.getClass().getName());
        Assert.assertEquals("Cat", luna.getClass().getName());
    }

    @Test
    public void testSpeak(){
        Pet nagini = new Snake();
        Pet krypto = new Dog();
        Pet luna = new Cat();

        Assert.assertEquals("Parseltongue", nagini.speak());
        Assert.assertEquals("Woof", krypto.speak());
        Assert.assertEquals("Meow", luna.speak());
    }

}
