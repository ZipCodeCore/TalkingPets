import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void speakTest(){
        // Given:
        Pet chicken = new Chicken("Protein");
        String expected = "Cuckoo";

        // When:
        String actual = chicken.speak();

        // Then:
        Assert.assertEquals(expected,actual);
    }
}
