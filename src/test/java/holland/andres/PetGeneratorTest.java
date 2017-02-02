package holland.andres;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by andresholland on 2/1/17.
 */
public class PetGeneratorTest {

    @Test
    public void createPetTest () {
        PetGenerator petGenerator = new PetGenerator();
        Pet testIguana = petGenerator.createPet("carlos", "iguana");
        String expected = "hello";
        String actual = testIguana.speak();
        assertEquals(expected, actual);
    }

    @Test
    public void createCatTest () {
        PetGenerator petGenerator = new PetGenerator();
        Pet testCat = petGenerator.createPet("carlos", "cat");
        String expected = "meow";
        String actual = testCat.speak();
        assertEquals(expected, actual);
    }

    @Test
    public void createDogTest () {
        PetGenerator petGenerator = new PetGenerator();
        Pet testDog = petGenerator.createPet("carlos", "dog");
        String expected = "guagua";
        String actual = testDog.speak();
        assertEquals(expected, actual);
    }

    @Test
    public void createDinoTest () {
        PetGenerator petGenerator = new PetGenerator();
        Pet testDino = petGenerator.createPet("carlos", "dino");
        String expected = "roar";
        String actual = testDino.speak();
        assertEquals(expected, actual);
    }

}
