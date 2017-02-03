package collins.john;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
/**
 * Created by johncollins on 1/31/17.
 */
public class CatTest {

    Pet testCat;
    Pet testDog;
    Pet testSnake;
    ArrayList<Pet> testPets;

    @Before
    public void setUp() throws Exception {
        testCat = new Cat("Mr.Cat");
        testDog = new Dog("Mr.Dog");
        testSnake = new Snake("Mr.Snake");
        testPets = new ArrayList<Pet>();
        testPets.add(testDog);
        testPets.add(testSnake);
        testPets.add(testCat);


    }
    @Test
    public void speakTest(){
        String actual = testCat.speak();
        String expected = "meow";
        //String expected = null;
        assertEquals("should return 'meow' ", expected, actual);
        }
    @Test
    public void nameTest(){
        String actual = testCat.name;
        String expected = "Mr.Cat";
        //String expected = null;
        assertEquals("should return 'Mr.Cat' ", expected, actual);
    }
    @Test
    public void ComparableSortTest(){
        Collections.sort(testPets);
        String actual = testPets.get(0).name;
        String expected = "Mr.Cat";
        assertEquals("should return Mr.Cat, Cat type is alpha first", expected, actual);
    }
}
