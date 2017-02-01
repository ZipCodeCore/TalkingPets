import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by randallcrame on 1/31/17.
 */
public class PetGeneratorTest {
    PetGenerator petGen;

    @Before
    public void setUp(){
        petGen = new PetGenerator();
    }

    @Test
    public void createPetOfDogTest(){
        String expected = "Dog";
        String actual = petGen.createPet("Sam", "Dog").getClass().getSimpleName();
        Assert.assertEquals("Expected a return of dog when calling class.", expected,actual);
    }

    @Test
    public void createPetOfDCatTest(){
        String expected = "Cat";
        String actual = petGen.createPet("Sam", "cat").getClass().getSimpleName();
        Assert.assertEquals("Expected a return of dog when calling class.", expected,actual);
    }

    @Test
    public void createPetOfDinoTest(){
        String expected = "Dino";
        String actual = petGen.createPet("Sam", "Dino").getClass().getSimpleName();
        Assert.assertEquals("Expected a return of dog when calling class.", expected,actual);
    }

    @Test
    public void createPetOfOtherInputTest(){
        String expected = "Pet";
        String actual = petGen.createPet("Sam", "askdjfaosj").getClass().getSimpleName();
        Assert.assertEquals("Expected a return of dog when calling class.", expected,actual);
    }
}
