import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void speakTest(){
        // Given:
        Dog dog = new Dog("Clifford");
        String expected = "Woof";

        // When:
        String actual = dog.speak();

        // Then:
        Assert.assertEquals(expected,actual);
    }


}
