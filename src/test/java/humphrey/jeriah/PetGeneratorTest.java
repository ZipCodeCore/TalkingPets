package humphrey.jeriah;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 2/1/17.
 */
public class PetGeneratorTest {

    PetGenerator gen;

    @Before
    public void setUp(){
        gen = new PetGenerator();

    }

    @Test
    public void createDogTestName(){
        Dog dog = gen.createDog( "Fido");
        String expected = "Fido";
        String actual = dog.getName();
        assertEquals("I expect to create a dog named Fido", expected, actual);
    }

    @Test
    public void createDogTestType(){
        Dog dog = gen.createDog( "Fido");
        assertEquals("I expect to create a dog named Fido", Dog.class, dog.getClass());
    }


    @Test
    public void createCatTestName(){
        Cat cat = gen.createCat( "Fido");
        String expected = "Fido";
        String actual = cat.getName();
        assertEquals("I expect to create a dog named Fido", expected, actual);
    }

    @Test
    public void createCatTestType(){
        Cat cat = gen.createCat( "Fido");
        assertEquals("I expect to create a dog named Fido", Cat.class, cat.getClass());
    }

    @Test
    public void createDinoTestName(){
        Dino dino = gen.createDino( "Fido");
        String expected = "Fido";
        String actual = dino.getName();
        assertEquals("I expect to create a dog named Fido", expected, actual);
    }

    @Test
    public void createDinoTestType(){
        Dino dino = gen.createDino( "Fido");
        assertEquals("I expect to create a dog named Fido", Dino.class, dino.getClass());
    }



}