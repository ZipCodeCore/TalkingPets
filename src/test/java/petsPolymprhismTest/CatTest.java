package petsPolymorphism;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jennifermcginty on 5/5/17.
 */
public class CatTest {

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
