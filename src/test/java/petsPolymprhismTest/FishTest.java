package petsPolymorphism;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jennifermcginty on 5/5/17.
 */
public class FishTest {
    @Test
    public void testDogSpeak() {
        Fish fishie = new Fish("Bubbles", "Fish");

        //given
        String expectedResult= "Blurp";

        //when
        String actualResult= fishie.speak();

        //then
        assertEquals("This should return blurp for a fishie", expectedResult, actualResult);

    }
}
