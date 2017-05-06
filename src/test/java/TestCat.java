/**
 * Created by mollyarant on 5/6/17.
 */


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCat {

    @Test
    public void testCatSpeak() {
        Cat kitty = new Cat("Sir Kittens", "Cat");

        //given
        String expectedResult= "Meow";

        //when
        String actualResult= kitty.speak();

        //then
        assertEquals("This should return meow for a kitty", expectedResult, actualResult);

    }


}
