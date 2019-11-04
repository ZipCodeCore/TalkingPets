package io.zipcoder.polymorphism;
import io.zipcoder.polymorphism.Pets.Cat;
import org.junit.Test;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {

    @Test
    public void testCat(){
        Cat cat = new Cat("Francis");
        cat.speak();
    }

}
