import io.zipcoder.pets.Output;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prestonbattin on 1/31/17.
 */
public class OutputTest {

    Output output;

    @Before
    public void setup(){

        output = new Output();
    }

    @Test
    public void setNumPetsTest(){


        int expected = 2;
        output.setNumPets(2);
        int actual = output.getNumPets();
        Assert.assertEquals("Testing correct output of pets", expected, actual);
    }

    @Test
    public void typePetTest(){

        String expected = "Pig";
        output.setTypePet("Pig");
        String actual = output.getTypePet();
        Assert.assertEquals("Testing the type choosen", expected, actual);
    }

    @Test
    public void petNameTest(){

        String expected = "Albert";
        output.setNameOfPet("Albert");
        String actual = output.getName();
        Assert.assertEquals("Testing the name set",expected,actual);
    }

    @Test
    public void setPetTest(){

        String expected = "Woof";
        output.setPet("Dog", "Bruce");
        String actual = output.getPet().speak();
        Assert.assertEquals("Testing pet creation", expected, actual);
    }
}
