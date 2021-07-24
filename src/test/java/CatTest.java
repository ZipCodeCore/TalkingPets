import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void speakTest(){
        // Given:
        Pet cat = new Cat("Garfield");
        String expected = "Meow";

        // When:
        String actual = cat.speak();

        // Then:
        Assert.assertEquals(expected,actual);
    }
}
