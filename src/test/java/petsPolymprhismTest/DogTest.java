package petsPolymorphism;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jennifermcginty on 5/5/17.
 */
public class DogTest {
    @Test
    public void testDogSpeak() {
        Dog doggie = new Dog("Sir Doggin of Dogginton", "Dog");

        //given
        String expectedResult= "Woof";

        //when
        String actualResult= doggie.speak();

        //then
        assertEquals("This should return woof for a doggie", expectedResult, actualResult);

    }

}
