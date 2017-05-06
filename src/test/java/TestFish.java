import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mollyarant on 5/6/17.
 */
public class TestFish {

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
